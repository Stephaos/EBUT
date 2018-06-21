package de.htwg_konstanz.wholesaler.rsClient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RESTClient {

	public static final String files = "C:/Users/Steph/eclipse-workspace/EBUT/Assignment3/WholesalerWebDemo/files";

	private Client client;
	private String target;

	public RESTClient() {
		this.client = ClientBuilder.newClient();
		this.target = "http://localhost:8080/WholesalerWebDemo/rest/";
	}

	public Client getClient() {
		return client;
	}

	public String getTarget() {
		return target;
	}

	public static void main(String[] args) {
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		boolean doExit = false;

		while (!doExit) {

			System.out.print("Import 1 // Export 2 // x to Exit: ");

			try {
				input = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("----------------------------------------------------------------------");
			RESTClient rc = new RESTClient();
			switch (input) {
			case "1":
				rc.importMethod();
				break;
			case "2":
				rc.exportMethod();
				break;
			case "x":
				doExit = true;
				break;

			default:
				break;
			}
		}
	}

	public void importMethod() {
		try {
			InputStream stream;
			Response response;
			String message;
			File file;

			/*
			 *
			 */
			System.out.println("Import a nonvalid xml-file");
			file = new File(RESTClient.files + "/notValid.xml");
			stream = new FileInputStream(file);
			response = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/import/upload")
					.request(MediaType.TEXT_PLAIN).header("filename", file.getName()).post(Entity.xml(stream));
			message = response.readEntity(String.class);
			System.out.println(message);

			Thread.sleep(1000);
			System.out.println("----------------------------------------------------------------------");

			/*
			 *
			 */
			System.out.println("Import a not well-formed xml-file");
			file = new File(RESTClient.files + "/notWellFormed.xml");
			stream = new FileInputStream(file);

			response = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/import/upload")
					.request(MediaType.TEXT_PLAIN).header("filename", file.getName()).post(Entity.xml(stream));

			message = response.readEntity(String.class);
			System.out.println(message);

			Thread.sleep(1000);
			System.out.println("----------------------------------------------------------------------");

			/*
			 *
			 */
			System.out.println("Import an html-file with valid and well-formed xml, unknown supplier");
			file = new File(RESTClient.files + "/notxml1.html");
			stream = new FileInputStream(file);

			response = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/import/upload")
					.request(MediaType.TEXT_PLAIN).header("filename", file.getName()).post(Entity.xml(stream));

			message = response.readEntity(String.class);
			System.out.println(message);

			Thread.sleep(1000);
			System.out.println("----------------------------------------------------------------------");

			/*
			 *
			 */
			System.out.println("Import a valid html-file");
			file = new File(RESTClient.files + "/notxml2.html");
			stream = new FileInputStream(file);

			response = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/import/upload")
					.request(MediaType.TEXT_PLAIN).header("filename", file.getName()).post(Entity.xml(stream));

			message = response.readEntity(String.class);
			System.out.println(message);

			Thread.sleep(1000);
			System.out.println("----------------------------------------------------------------------");

			/*
			 *
			 */
			System.out.println("Import an unknown supplier");
			file = new File(RESTClient.files + "/supplier.xml");
			stream = new FileInputStream(file);

			response = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/import/upload")
					.request(MediaType.TEXT_PLAIN).header("filename", file.getName()).post(Entity.xml(stream));

			message = response.readEntity(String.class);
			System.out.println(message);

			Thread.sleep(1000);
			System.out.println("----------------------------------------------------------------------");

			/*
			 *
			 */
			System.out.println("Import a valid and well-formed xml-file");
			file = new File(RESTClient.files + "/valid.xml");
			stream = new FileInputStream(file);

			Response valid = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/import/upload")
					.request(MediaType.TEXT_PLAIN).header("filename", file.getName()).post(Entity.xml(stream));

			message = valid.readEntity(String.class);
			System.out.println(message);
			System.out.println("----------------------------------------------------------------------");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void exportMethod() {
		System.out.println("Export all XML-Data");

		InputStream xmlAll = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/export/all")
				.request(MediaType.APPLICATION_XML).header("Content-Type", MediaType.APPLICATION_XML)
				.get(InputStream.class);

		if (this.writeFile("allxml.xml", xmlAll)) {
			System.out.println("Data saved");
		} else {
			System.out.println("Data not saved!");
		}
		
		/*
		 *
		 *
		 */		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Export all XHTML-Data");

		InputStream xhtmlAll = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/export/all")
				.request(MediaType.APPLICATION_XHTML_XML).header("Content-Type", MediaType.APPLICATION_XHTML_XML)
				.get(InputStream.class);

		if (this.writeFile("allxhtml.xml", xhtmlAll)) {
			System.out.println("Data saved!");
		} else {
			System.out.println("Data not saved!");
		}
		System.out.println("----------------------------------------------------------------------");
	}

	public boolean writeFile(String filename, InputStream in) {
		OutputStream out;
		try {
			out = new FileOutputStream(filename);
			byte[] buffer = new byte[1024];
			int len;
			while ((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len);
			}
			out.close();
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		return true;
	}

}
