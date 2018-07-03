package de.htwg_konstanz.ebus.rest;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import de.htwg_konstanz.ebus.framework.wholesaler.api.boa._BaseBOA;
import de.htwg_konstanz.ebus.wholesaler.main.ImportParser;
import de.htwg_konstanz.ebus.wholesaler.main.XMLValidation;

@Path("/import")
public class Import {

	ArrayList<String> errorList;
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloWorld() {
		return "You´ve reached the Import";
	}
	

	@POST
	@Path("/upload") // Path to call method
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
	public Response uploadFile(InputStream stream) {
		String message;
		int status;

		message = "error could not upload file";
		status = 404;

		try {
			// create and configure the factory for DOM
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			docFactory.setIgnoringElementContentWhitespace(true);
			docFactory.setIgnoringComments(true);
			// Read the uploaded file
			DocumentBuilder builder = docFactory.newDocumentBuilder();
			// parse checks for WF
			Document document = builder.parse(stream);
			XMLValidation validator = new XMLValidation();
			if (validator.isValid(document)) {
				
				ImportParser importer = new ImportParser(errorList);
				String importMessage = importer.importToDB(document);
				
				if(importMessage.equals("UNKNOWNSUPPLIER")) {
					_BaseBOA.getInstance().commit();
					message = "Unknown Supplier";
					return Response.status(500).entity("Unknown Supplier").build();
				} else {
					String dataImported = importMessage.split(" ")[2];
					_BaseBOA.getInstance().commit();
					return Response.ok("Successfully imported: "+dataImported+" Nodes").build();
				}
			} else {
				message = "Document is not valid xml";
				status = 500;
			}
		} catch (ParserConfigurationException e) {
			message = e.getMessage();
			status = 500;
			
		} catch (SAXException e) {
			// Document is not well-formed
			message = "Document is not well-formed";
			status = 500;
		} catch (IOException e) {
			// no file given
			message = "No file";
			status = 500;
		}
		
		// COMMIT!!!!!!
	    _BaseBOA.getInstance().commit();

		return Response.status(status).entity(message).build();
	}	
}
