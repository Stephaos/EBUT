package de.htwg_konstanz.ebus.wholesaler.main;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOCountry;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOPurchasePrice;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSalesPrice;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSupplier;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.CountryBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.PriceBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.ProductBOA;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.SupplierBOA;

// TODO: Auto-generated Javadoc
/**
 * The Class DBImport.
 */
public class ImportParser {


	/** The product. */
	private BOProduct product;

	/** The supplier. */
	private BOSupplier supplier = null;
	
	private int notImportedArticles = 0; 
	private int allArticles = 0;
	
	private static ArrayList<String> errorList;
	
	
	/**
	 * @param doc Valid dom document
	 * @param errorList
	 */
	@SuppressWarnings("static-access")
	public ImportParser(ArrayList<String> errorList) {
		this.errorList = errorList;

	}
	
	/**
	 * Import to db.
	 *
	 * @param document the document
	 * @return the string
	 */
	public String importToDB(Document document){
		try {
			//create XPath object
			XPath xpath = XPathFactory.newInstance().newXPath();
			//create NodeList
			NodeList nodes;
			//read supplier from xml
			supplier = getSupplier(document, xpath);
			if(supplier != null){
				//get all articles
				nodes = (NodeList)xpath.evaluate("//T_NEW_CATALOG/ARTICLE", document.getDocumentElement(), XPathConstants.NODESET);
				this.allArticles = nodes.getLength();
				//add them to db
				addArticles(xpath, nodes);
				errorList.add("SUCCESSFULLY IMPORTED " + (this.allArticles - this.notImportedArticles) + " FROM " + this.allArticles);
				return "SUCCESSFULLY IMPORTED " + (this.allArticles - this.notImportedArticles) + " FROM " + this.allArticles;
			} else {
				errorList.add("UNKNOWN SUPPLIER");
				return "UNKNOWNSUPPLIER";
			}
		} catch (IOException |  XPathExpressionException e) {
			return "Error:" +e.getMessage();
		}
	}

	/**
	 * Gets the supplier.
	 *
	 * @param document the document
	 * @param xpath the xpath
	 * @return the supplier
	 * @throws XPathExpressionException the x path expression exception
	 */
	private BOSupplier getSupplier(Document document, XPath xpath) throws XPathExpressionException {
		//read Suplier name
		NodeList nodes = (NodeList)xpath.evaluate("//SUPPLIER_NAME", document.getDocumentElement(), XPathConstants.NODESET);
		//there can be only one
		Node item = nodes.item(0);
		//get Textnode (the child) and read the value
		String supplier = item.getFirstChild().getNodeValue();
		//look for a supplier with this name
		List<BOSupplier> findByCompanyName = SupplierBOA.getInstance().findByCompanyName(supplier);
		//there should be one 
		if(findByCompanyName.size() > 0){
			return findByCompanyName.get(0);
		}else{
			//debug code delete this later
			return null;
		}
	}

	/**
	 * Adds the articles.
	 *
	 * @param xpath the xpath
	 * @param nodes the nodes
	 * @throws XPathExpressionException the x path expression exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private void addArticles(XPath xpath, NodeList nodes) throws XPathExpressionException, IOException {
		//every article
		for (int i = 0; i < nodes.getLength(); i++) {

			Node article = nodes.item(i);
			//load Product
			product = loadOrCreateProduct(article, xpath);
			if(product == null){
				continue;
			} else {
				//every product needs a supplier 
				product.setSupplier(supplier);
				product.setManufacturer(supplier.getCompanyname());
				//get all childs for Details and add them to the product
				NodeList details = (NodeList) xpath.evaluate("ARTICLE_DETAILS",article ,XPathConstants.NODESET);
				addDetails(details, xpath);
				//update if this Product already exist or create a new one
				product.setInventoryAmount(0);
	
				ProductBOA instance = ProductBOA.getInstance();
				instance.saveOrUpdate(product);
	
				//read all child from Price_Details and add them to the product
				NodeList priceDetails = (NodeList) xpath.evaluate("ARTICLE_PRICE_DETAILS/*",article ,XPathConstants.NODESET);
	
				addPriceDetails(priceDetails, xpath);
			}
		}
	}

	/**
	 * Load or create product.
	 *
	 * @param article the article
	 * @param xpath the xpath
	 * @return the BO product
	 * @throws XPathExpressionException the x path expression exception
	 */
	private BOProduct loadOrCreateProduct(Node article, XPath xpath) throws XPathExpressionException{

		//get the aid
//		Node node = (Node) xpath.evaluate("*/EAN", article, XPathConstants.NODE);
		Node node = (Node) xpath.evaluate("SUPPLIER_AID", article, XPathConstants.NODE);
		Node node2 = (Node) xpath.evaluate("*/EAN", article, XPathConstants.NODE);
		String materialNumber = node.getFirstChild().getNodeValue();
		String EAN = node2.getFirstChild().getNodeValue();
		
		//try to find a existing product
		BOProduct found = ProductBOA.getInstance().findByOrderNumberSupplier(EAN);
		
//		System.out.println("getOrderNumberSupplier: " + found.getOrderNumberSupplier());
		
//		System.out.println("EAN 1 " + found.getOrderNumberSupplier());
//		System.out.println("EAN 2 " + EAN);
//		
		if(found == null){

			return createProduct(EAN);
		}else{
			if(found.getSupplier().getSupplierNumber().equals(supplier.getSupplierNumber())){
				this.notImportedArticles++;
				return null;	
			} else if(found.getOrderNumberSupplier().equals(EAN)) {
				this.notImportedArticles++;
				return null;
			} else {
				System.out.println("Falsch 2");
				return createProduct(EAN);
			}
		}
	}

	private BOProduct createProduct(String orderNumberSupplier) {
		//if not found create a new one
		product = new BOProduct();
		product.setOrderNumberSupplier(orderNumberSupplier);
		product.setOrderNumberCustomer(orderNumberSupplier);
//		product.setOrderNumberCustomer(String.format("%s%s", orderNumberSupplier, supplier.getSupplierNumber()));
		
		return product;
	}

	/**
	 * Adds the price details.
	 *
	 * @param details the details
	 * @param xpath the xpath
	 * @throws XPathExpressionException the x path expression exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void addPriceDetails(NodeList details, XPath xpath) throws XPathExpressionException, IOException{

		//for every Price
		List<BOPurchasePrice> list = product.getPurchasePrices();
		if(list.size() > 0){
			for(BOPurchasePrice purchasePrice : list){
				//same with sale prices
				BOSalesPrice sale = new BOSalesPrice();
//				//Customer must pay 2 times of the real price
//				sale.setAmount(purchasePrice.getAmount().multiply(new BigDecimal("2")));
				
				sale.setAmount(purchasePrice.getAmount());
				
				sale.setTaxrate(purchasePrice.getTaxrate());
				sale.setPricetype(purchasePrice.getPricetype());
				sale.setLowerboundScaledprice(1);
	
				sale.setCountry(purchasePrice.getCountry());
				//save both
				sale.setProduct(product);
				PriceBOA priceInstance = PriceBOA.getInstance();
				priceInstance.saveOrUpdateSalesPrice(sale);
			}
			return;
		} else {
			
			for (int j = 0; j < details.getLength(); j++) {
				Node detail = details.item(j);
				//read the Attribute
				Element e = (Element) detail;
				String type = e.getAttribute("price_type");
				NodeList countries = (NodeList) xpath.evaluate("TERRITORY", detail, XPathConstants.NODESET);
				//every Country gets a own price
				for (int i = 0; i < countries.getLength(); i++) {
	
					BOPurchasePrice purchasePrice = new BOPurchasePrice();
					//read amount
					Node amount =(Node) xpath.evaluate("PRICE_AMOUNT", detail, XPathConstants.NODE);
					purchasePrice.setAmount(new BigDecimal(amount.getFirstChild().getNodeValue()));
					//default in DB = 1 
					purchasePrice.setLowerboundScaledprice(1);
	
					//forgin key and type
					purchasePrice.setProduct(product);
					purchasePrice.setPricetype(type);
	
					//get the ISO-Code for the country
					Node item = countries.item(i);
					String country = item.getFirstChild().getNodeValue();
	
					//try to find a existing country
					CountryBOA countryInstance = CountryBOA.getInstance();
					BOCountry boCountry = countryInstance.findCountry(country);
					//if the country dosent exist 
					if(boCountry == null){
						errorList.add(String.format("Country '%s' don´t exist", country));
						throw new IOException(String.format("Country '%s' don´t exist", country));
					}
					purchasePrice.setCountry(boCountry);
	
					//read Tax
					Node tax = (Node) xpath.evaluate("TAX", detail, XPathConstants.NODE);
					purchasePrice.setTaxrate(new BigDecimal(tax.getFirstChild().getNodeValue()));
	
					//same with sale prices
					BOSalesPrice sale = new BOSalesPrice();
//					//Customer must pay 2 times of the real price
//					sale.setAmount(purchasePrice.getAmount().multiply(new BigDecimal("2")));
					sale.setAmount(purchasePrice.getAmount());
					sale.setTaxrate(purchasePrice.getTaxrate());
					sale.setPricetype(type);
					sale.setLowerboundScaledprice(1);
	
					sale.setCountry(boCountry);
	
					//save both
					sale.setProduct(product);
					PriceBOA priceInstance = PriceBOA.getInstance();
					priceInstance.saveOrUpdatePurchasePrice(purchasePrice);
					priceInstance.saveOrUpdateSalesPrice(sale);
					
				}
	
	
			}
		}
	}

	/**
	 * Adds the details.
	 *
	 * @param details the details
	 * @param xpath the xpath
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws XPathExpressionException the x path expression exception
	 */
	public void addDetails(NodeList details, XPath xpath) throws IOException, XPathExpressionException{
		//every Detail
		for (int j = 0; j < details.getLength(); j++) {
			Node detail = details.item(j);

			//Read descriptions
			Node desShort = (Node) xpath.evaluate("DESCRIPTION_SHORT", detail, XPathConstants.NODE);
			product.setShortDescription(desShort.getFirstChild().getNodeValue());
			Node desLong = (Node) xpath.evaluate("DESCRIPTION_LONG", detail, XPathConstants.NODE);
			product.setLongDescription(desLong.getFirstChild().getNodeValue());
		}
	}
}
