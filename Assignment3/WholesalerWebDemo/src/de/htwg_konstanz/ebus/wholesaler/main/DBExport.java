package de.htwg_konstanz.ebus.wholesaler.main;

import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOCurrency;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct;
import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOSalesPrice;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.ProductBOA;

// TODO: Auto-generated Javadoc
/**
 * The Class DBExport.
 */
public class DBExport {
	
	/** The Constant ARTICLE_NUMBER. */
	private static final String ARTICLE_NUMBER = "EAN";
	
	/** The Constant DESCRIPTION_LONG. */
	private static final String DESCRIPTION_LONG = "DESCRIPTION_LONG";
	
	/** The Constant DESCRIPTION_SHORT. */
	private static final String DESCRIPTION_SHORT = "DESCRIPTION_SHORT";
	
	/** The Constant ARTICLE_DETAILS. */
	private static final String ARTICLE_DETAILS = "ARTICLE_DETAILS";
	
	/** The Constant SUPPLIER_AID. */
	private static final String SUPPLIER_AID = "SUPPLIER_AID";
	
	/** The Constant ARTICLE_TAG. */
	private static final String ARTICLE_TAG = "ARTICLE";
	
	/** The Constant ARTICLE_LIST. */
	private static final String ARTICLE_LIST = "T_NEW_CATALOG";
	
	/** The Constant OUR_NAME. */
	private static final String OUR_NAME = "HTWG Konstanz Tandem 11";
	
	/** The Constant SUPPLIER_NAME. */
	private static final String SUPPLIER_NAME = "SUPPLIER_NAME";
	
	/** The Constant SUPPLIER. */
	private static final String SUPPLIER = "SUPPLIER";
	
	/** The Constant EXPORT. */
	private static final String EXPORT = "EXPORT";
	
	/** The Constant CATALOG_NAME. */
	private static final String CATALOG_NAME = "CATALOG_NAME";
	
	/** The Constant VERSION_VALUE. */
	private static final String VERSION_VALUE = "1.0";
	
	/** The Constant CATALOG_VERSION. */
	private static final String CATALOG_VERSION = "CATALOG_VERSION";
	
	/** The Constant HTWG_EBUS_EXPORT. */
	private static final String HTWG_EBUS_EXPORT = "HTWG-EBUS-EXPORT";
	
	/** The Constant CATALOG_ID. */
	private static final String CATALOG_ID = "CATALOG_ID";
	
	/** The Constant LANGUAGE_VALUE. */
	private static final String LANGUAGE_VALUE = "deu";
	
	/** The Constant LANGUAGE. */
	private static final String LANGUAGE = "LANGUAGE";
	
	/** The Constant CATALOG. */
	private static final String CATALOG = "CATALOG";
	
	/** The Constant HEADER. */
	private static final String HEADER = "HEADER";
	
	/** The Constant SCHEMA_INSTANCE. */
	private static final String SCHEMA_INSTANCE = "http://www.w3.org/2001/XMLSchema-instance";
	
	/** The Constant SCHEMA. */
	private static final String SCHEMA = "xmlns:xsi";
	
	/** The Constant ROOT_VERSION. */
	private static final String ROOT_VERSION = "version";
	
	/** The Constant ROOT_VERSION. */
	private static final String ROOT_VERSION_NUMBER = "1.2";
	
	/** The Constant ROOT. */
	private static final String ROOT = "BMECAT";

	/**
	 * Read products with description.
	 *
	 * @param description the description
	 * @return the document
	 * @throws ParserConfigurationException the parser configuration exception
	 */
	public Document readProductsWithDescription(String description) throws ParserConfigurationException{
		List<BOProduct> searchedProducts = ProductBOA.getInstance().findByCriteriaLike("Shortdescription", "%" + description + "%");
		return createDocumentfromProducts(searchedProducts);
	}
	
	/**
	 * Read all products.
	 *
	 * @return the document
	 * @throws ParserConfigurationException the parser configuration exception
	 */
	public Document readAllProducts() throws ParserConfigurationException {
		List<BOProduct> allProducts = ProductBOA.getInstance().findAll();
		return createDocumentfromProducts(allProducts);
	}

	/**
	 * Creates the xml from products.
	 *
	 * @param products the products
	 * @return the document
	 * @throws ParserConfigurationException the parser configuration exception
	 */
	//Gets List and returns XML 
	public Document createDocumentfromProducts(List<BOProduct> products) throws ParserConfigurationException{
		//create the new document
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.newDocument();
		
		//create the root and append it
		Element rootElement = createRoot(document);
		document.appendChild(rootElement);
		
		//create Header and append it 
		Element headerElement = createHeader(document);
		rootElement.appendChild(headerElement);
		
		//create every Element
		Element articleList = document.createElement(ARTICLE_LIST);
		System.out.println(products);
		for (BOProduct product : products) {
			
			Element articleElement = document.createElement(ARTICLE_TAG);
			Element supplierAid = addSupplierAID(document, product);
			articleElement.appendChild(supplierAid);
			
			Element articleDetails = readDetails(document, product);
			
			articleElement.appendChild(articleDetails);
			Element orderDetails = createOrderDetails(document);
			articleElement.appendChild(orderDetails);
			Element articlePriceDetails = createPrice(document, product);
			articleElement.appendChild(articlePriceDetails);
			articleList.appendChild(articleElement);
		}
		rootElement.appendChild(articleList);
		return document;
	}
	
	private Element createOrderDetails(Document document) {
		
		Element articleDetails = document.createElement("ARTICLE_ORDER_DETAILS");
		Element orderUnit = document.createElement("ORDER_UNIT");
		String unit = "PK";
		orderUnit.appendChild(document.createTextNode(unit));
		articleDetails.appendChild(orderUnit);
		
		Element contentUnit = document.createElement("CONTENT_UNIT");
		String content = "C62";
		contentUnit.appendChild(document.createTextNode(content));
		articleDetails.appendChild(contentUnit);
		
		Element noCu = document.createElement("NO_CU_PER_OU");
		String number = "10";
		noCu.appendChild(document.createTextNode(number));
		articleDetails.appendChild(noCu);
		return articleDetails;
	}

	/**
	 * Creates the price.
	 *
	 * @param document the document
	 * @param product the product
	 * @return the element
	 */
	private Element createPrice(Document document, BOProduct product) {
		
		Element articlePriceDetails = document.createElement("ARTICLE_PRICE_DETAILS");
		Iterator<BOSalesPrice> iterator = product.getSalesPrices().iterator();
		Iterator<BOSalesPrice> tempIterator = product.getSalesPrices().iterator();
		while (iterator.hasNext()) {
			BOSalesPrice salePrice = (BOSalesPrice) iterator.next();
			//Create new Price Tag and add type Attribute
			Element articlePrice = document.createElement("ARTICLE_PRICE");
			articlePrice.setAttribute("price_type", salePrice.getPricetype());
			
			//Create the amount tag
			Element priceAmount = document.createElement("PRICE_AMOUNT");
			String amount = salePrice.getAmount().toString();
			priceAmount.appendChild(document.createTextNode(amount));
			articlePrice.appendChild(priceAmount);
			
			//Create the currency Tag
			Element currency = document.createElement("PRICE_CURRENCY");
			BOCurrency priceCurrency = salePrice.getCountry().getCurrency();
			String code = priceCurrency.getCode();
			currency.appendChild(document.createTextNode(code));
			articlePrice.appendChild(currency);
			
			//Create the Tax Tag
			Element tax = document.createElement("TAX");
			String taxRate = salePrice.getTaxrate().toString();
			tax.appendChild(document.createTextNode(taxRate));
			articlePrice.appendChild(tax);
			
			Element saleCountry = document.createElement("TERRITORY");
			String saleIsocode = salePrice.getCountry().getIsocode();
			saleCountry.appendChild(document.createTextNode(saleIsocode));
			articlePrice.appendChild(saleCountry);
			
			articlePriceDetails.appendChild(articlePrice);
			
		}
		return articlePriceDetails;
	}

	/**
	 * Read details.
	 *
	 * @param document the document
	 * @param product the product
	 * @return the element
	 */
	private Element readDetails(Document document, BOProduct product) {
		Element articleDetails = document.createElement(ARTICLE_DETAILS);
		//Create short description
		Element descriptionShort = document.createElement(DESCRIPTION_SHORT);
		String shortDescription = product.getShortDescription();
		descriptionShort.appendChild(document.createTextNode(shortDescription));
		articleDetails.appendChild(descriptionShort);
		
		//Create long description
		Element descriptionLong = document.createElement(DESCRIPTION_LONG);
		String longDescription = product.getLongDescription();
		descriptionLong.appendChild(document.createTextNode(longDescription));
		articleDetails.appendChild(descriptionLong);
		
		//Create article number 
		Element articleNumber = document.createElement(ARTICLE_NUMBER);
		String number = product.getOrderNumberCustomer();
		number = number.substring(0, number.length() >= 14 ? 14 : number.length());
		articleNumber.appendChild(document.createTextNode(number));
		articleDetails.appendChild(articleNumber);
		return articleDetails;
	}

	/**
	 * Adds the supplier aid.
	 *
	 * @param document the document
	 * @param product the product
	 * @return the element
	 */
	private Element addSupplierAID(Document document, BOProduct product) {
		Element supplierAid = document.createElement(SUPPLIER_AID);
		String supplierNumber = product.getMaterialNumber().toString();
		supplierAid.appendChild(document.createTextNode(supplierNumber));
		return supplierAid;
	}

	/**
	 * Creates the header.
	 *
	 * @param document the document
	 * @return the element
	 */
	private Element createHeader(Document document) {
		//HEAD ELEMENT
		Element headerElement = document.createElement(HEADER);
		//CATALOG ELEMENT
		Element catalogElement = createCatalogTag(document);
		headerElement.appendChild(catalogElement);
		
		//Create supplier
		Element supplierElement = createSupplierTag(document);
		headerElement.appendChild(supplierElement);
		return headerElement;
	}

	/**
	 * Creates the supplier tag.
	 *
	 * @param document the document
	 * @return the element
	 */
	private Element createSupplierTag(Document document) {
		Element supplierElement = document.createElement(SUPPLIER);
		Element supplierName = document.createElement(SUPPLIER_NAME);
		supplierName.appendChild(document.createTextNode(OUR_NAME));
		supplierElement.appendChild(supplierName);
		return supplierElement;
	}

	/**
	 * Creates the catalog tag.
	 *
	 * @param document the document
	 * @return the element
	 */
	private Element createCatalogTag(Document document) {
		Element catalogElement = document.createElement(CATALOG);
		//THE LANUGAGE TAG
		Element languageElement = document.createElement(LANGUAGE);
		//VALUE OF LANGUAGE
		languageElement.appendChild(document.createTextNode(LANGUAGE_VALUE));
		//ID TAG
		Element catalogIDElement = document.createElement(CATALOG_ID);
		//ID VALUE
		catalogIDElement.appendChild(document.createTextNode(HTWG_EBUS_EXPORT));
		//VERSION TAG
		Element catalogVersionElement = document.createElement(CATALOG_VERSION);
		//VERSION VALUE
		catalogVersionElement.appendChild(document.createTextNode(VERSION_VALUE));
		//CATALOG NAME TAG
		Element catalogNameElement = document.createElement(CATALOG_NAME);
		//VALUE 
		catalogNameElement.appendChild(document.createTextNode(EXPORT));
		//put everything together
		catalogElement.appendChild(languageElement);
		catalogElement.appendChild(catalogIDElement);
		catalogElement.appendChild(catalogVersionElement);
		catalogElement.appendChild(catalogNameElement);
		return catalogElement;
	}

	/**
	 * Creates the root.
	 *
	 * @param document the document
	 * @return the element
	 */
	private Element createRoot(Document document) {
		Element rootElement = document.createElement(ROOT);
		Attr schemaAttribute = document.createAttribute(SCHEMA);
		schemaAttribute.setValue(SCHEMA_INSTANCE);
		rootElement.setAttributeNode(schemaAttribute);
		Attr versionAttribute = document.createAttribute(ROOT_VERSION);
		versionAttribute.setValue(ROOT_VERSION_NUMBER);
		rootElement.setAttributeNode(versionAttribute);
		return rootElement;
	}
}
