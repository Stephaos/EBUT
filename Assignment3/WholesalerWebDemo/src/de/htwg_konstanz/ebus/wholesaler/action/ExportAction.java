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
				document = exporter.readAllProducts();
			} else {
				document = exporter.readProductsWithDescription(request.getParameter("shortdesc"));
			}
			XMLTransform transformer = new XMLTransform();
			InputStream result = null;
			String fileName = "";
			if(request.getParameter("format").equals("XML")){
				 result = transformer.toXML(document);
				 fileName = "productcatalog.xml";
			} else {
				 result = transformer.toXHTML(document);
				 fileName = "productcatalog.html";
			}
			invokeDownload(request, response, result, fileName);
		} catch (ParserConfigurationException | IOException e) {
			e.printStackTrace();
		}
		return "products.jsp";
	}

	/* (non-Javadoc)
	 * @see de.htwg_konstanz.ebus.wholesaler.demo.IAction#accepts(java.lang.String)
	 */
	@Override
	public boolean accepts(String actionName) {
		return actionName.equalsIgnoreCase(Constants.ACTION_EXPORT);
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

}
