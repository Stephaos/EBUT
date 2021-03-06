package de.htwg_konstanz.ebus.rest;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.StreamingOutput;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import de.htwg_konstanz.ebus.wholesaler.main.DBExport;
import de.htwg_konstanz.ebus.wholesaler.main.XMLTransform;

@Path("/export")
public class Export {

	ArrayList<String> errorList;

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloWorld() {
		return "You´ve reached the Export";
	}
	
	@GET
	@Path("/all")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_XHTML_XML})
	public Response getAll(@HeaderParam("Content-Type") String format)
	{		
		try {
			DBExport exporter = new DBExport();
			Document document = null;
			document = exporter.readAllProducts();
			XMLTransform transformer = new XMLTransform();
			InputStream stream = null;
			
			if(format.equals("application/xml")) {
				stream = transformer.toXML(document);
				
			} else if(format.equals("application/xhtml+xml")) {
				stream = transformer.toXHTML(document);
				
			} else {
				return Response.status(500).entity("Wrong Datatype").build();
				
			}
			
			StreamingOutput fileStream = this.getFileStream(stream);

			ResponseBuilder response = Response.ok(fileStream, MediaType.APPLICATION_OCTET_STREAM);
			response.header("Content-Disposition", "attachment; filename=\"productcatalog.xml\"");
			return response.build();


		} catch (ParserConfigurationException e) {
			return Response.status(500).entity(e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/short/{desc}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_XHTML_XML})
	public Response getShort(@HeaderParam("Content-Type") String format, @PathParam("desc") String desc)
	{
		try {
			DBExport exporter = new DBExport();
			Document document = null;
			document = exporter.readProductsWithDescription(desc);
			XMLTransform transformer = new XMLTransform();
			InputStream stream = null;
			
			if(format.equals("application/xml")) {
				
				stream = transformer.toXML(document);
			} else if(format.equals("application/xhtml+xml")) {
				

				stream = transformer.toXHTML(document);
			} else {	

				return Response.status(500).entity("Wrong Datatype").build();
			}
			
			StreamingOutput fileStream = this.getFileStream(stream);

			ResponseBuilder response = Response.ok(fileStream, MediaType.APPLICATION_OCTET_STREAM);
			response.header("Content-Disposition", "attachment; filename=\"productcatalog.xml\"");
			return response.build();


		} catch (ParserConfigurationException e) {
			return Response.status(500).entity(e.getMessage()).build();
		}
	}
	
	@GET
	@Path("/all/{format}")
	@Produces(MediaType.APPLICATION_XML)
	public Response getAllFormatted(@PathParam("format") String format) {
		Export export = new Export();
		return export.getAll(format);
	}
	
	public StreamingOutput getFileStream(final InputStream stream) {
		StreamingOutput fileStream =  new StreamingOutput(){
			@Override
			public void write(java.io.OutputStream output) throws IOException, WebApplicationException 
			{

				int n;
				byte[] buffer = new byte[1024];
				while ((n = stream.read(buffer)) > -1) {
					output.write(buffer, 0, n);
				}
				stream.close();
				output.flush();
			}
		};
		return fileStream;
	}

}
