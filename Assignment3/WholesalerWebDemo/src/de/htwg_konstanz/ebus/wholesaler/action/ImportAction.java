/**
 * 
 */
package de.htwg_konstanz.ebus.wholesaler.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import de.htwg_konstanz.ebus.framework.wholesaler.api.bo.BOProduct;
import de.htwg_konstanz.ebus.framework.wholesaler.api.boa.ProductBOA;
import de.htwg_konstanz.ebus.wholesaler.demo.IAction;
import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;
import de.htwg_konstanz.ebus.wholesaler.main.ImportParser;
import de.htwg_konstanz.ebus.wholesaler.main.XMLValidation;


/**
 * @author markus
 *
 */
public class ImportAction implements IAction {

	public ImportAction() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.htwg_konstanz.ebus.wholesaler.demo.IAction#execute(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.util.ArrayList)
	 */
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response, ArrayList<String> errorList) {

		String message = "";
		try {
			System.out.println("Try");
			List<BOProduct> productList = ProductBOA.getInstance().findAll();
			request.getSession(true).setAttribute("productList", productList);
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			XMLValidation validator = new XMLValidation();

			List<FileItem> files = upload.parseRequest(request);
			FileItem fileItem = files.get(0);
			if (!fileItem.getName().substring(fileItem.getName().length() - 3, fileItem.getName().length())
					.equals("xml")) {
				message = "NOTXML";
				return String.format("products.jsp?message=%S", message);
			}
			InputStream stream = fileItem.getInputStream();
			System.out.println("Input Stream");
			// create and configure the factory for DOM
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			docFactory.setIgnoringElementContentWhitespace(true);
			docFactory.setIgnoringComments(true);
			// Read the uploaded file
			DocumentBuilder builder = docFactory.newDocumentBuilder();
			// validation
			Document document = builder.parse(stream);
			if (validator.isValid(document)) {
				stream.close();
				ImportParser importer = new ImportParser();
				message = importer.importToDB(document);
			} else {
				message = "NOTVALID";
				return String.format("products.jsp?message=%S", message);
			}
			productList = ProductBOA.getInstance().findAll();
			request.getSession(true).setAttribute("productList", productList);
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			message = "NOTWELLFORMED";
			e.printStackTrace();
		}
		return String.format("products.jsp?message=%S", message);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.htwg_konstanz.ebus.wholesaler.demo.IAction#accepts(java.lang.String)
	 */
	@Override
	public boolean accepts(String actionName) {
		return actionName.equalsIgnoreCase(Constants.ACTION_IMPORT);
	}

}
