package de.htwg_konstanz.ebus.wholesaler.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;
import de.htwg_konstanz.ebus.wholesaler.main.XMLTransform;
import de.htwg_konstanz.ebus.wholesaler.main.DBExport;
import de.htwg_konstanz.ebus.wholesaler.demo.IAction;

public class ExportAction implements IAction {

	/* (non-Javadoc)
	 * @see de.htwg_konstanz.ebus.wholesaler.demo.IAction#execute(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.util.ArrayList)
	 */
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response, ArrayList<String> errorList) {
		try {
			DBExport exporter = new DBExport();
			Document document = null;
			if(request.getParameter("version").equals("Whole Catalogue")){
				System.out.println("Whole Catalogue ");
				document = exporter.readAllProducts();
			} else {
				document = exporter.readProductsWithDescription(request.getParameter("shortdesc"));
			}
			XMLTransform transformer = new XMLTransform();
			InputStream result = null;
			String fileName = "";
			
			ServletOutputStream outputStream = response.getOutputStream();
			

			
			switch (request.getParameter("format")) {
			case "XML":
				result = transformer.toXML(document);
				 invoke(request, response, result);
				break;
			case "XHTML":
				 result = transformer.toXHTML(document);
				 invoke(request, response, result);
				break;
			case "XML Download":
				 result = transformer.toXML(document);
				 fileName = "productcatalog.xml";
				 invokeDownload(request, response, result, fileName);
				break;
			case "XHTML Download":
				 result = transformer.toXHTML(document);
				 fileName = "productcatalog.html";
				 invokeDownload(request, response, result, fileName);
				break;
			default:
				break;
			}
			
			
		} catch (ParserConfigurationException | IOException e) {
			e.printStackTrace();
		}
		return "products.jsp";
	}

	public void invokeDownload (HttpServletRequest request, HttpServletResponse response, InputStream inputStream, String filename) throws IOException{
		//type of download file
		response.setContentType("text/xml");
		response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
		ServletOutputStream outputStream = response.getOutputStream();
		int n;
		byte[] buffer = new byte[1024];
		while ((n = inputStream.read(buffer)) > -1) {
			outputStream.write(buffer, 0, n);
		}
		inputStream.close();
		outputStream.flush();
		outputStream.close();
	}
	
	public void invoke (HttpServletRequest request, HttpServletResponse response, InputStream inputStream) throws IOException{
		
		ServletOutputStream outputStream = response.getOutputStream();
		int n;
		byte[] buffer = new byte[1024];
		while ((n = inputStream.read(buffer)) > -1) {
			outputStream.write(buffer, 0, n);
		}
		inputStream.close();
		outputStream.flush();
		outputStream.close();
	}
	
	/* (non-Javadoc)
	 * @see de.htwg_konstanz.ebus.wholesaler.demo.IAction#accepts(java.lang.String)
	 */
	@Override
	public boolean accepts(String actionName) {
		return actionName.equalsIgnoreCase(Constants.ACTION_EXPORT);
	}

}
