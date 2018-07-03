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

	public static final String files = "/Volumes/Storage/files";

//	public static final String files = "C:/Users/Steph/eclipse-workspace/EBUT/Assignment4/JAXRSClient/files";

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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = 0;
		boolean doExit = false;

		while (!doExit) {
			RESTClient rc = new RESTClient();

			try {
				System.out.print("1) Import \n2) Export \n3) Exit\n");
				input = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (input == 1) {
				System.out.println("You´ve chosen the Import");
				try {
					System.out.println("What do you want to do? \n"
							+ "1) ImportInvalidXML\n"
							+ "2) ImportNotWellFormedXML\n"
							+ "3) ImportUnknownSupplier\n"
							+ "4) sample_articles_kn_media_store.xml\n"
							+ "5) ImportValidAndWellFormedXML\n");

					
					input = Integer.parseInt(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				rc.doImport(input);
			} else if (input == 2) {
				System.out.println("You´ve chosen the Export");
				try {
					System.out.println("What do you want to do next? \n"
							+ "1) ExportAllXML\n"
							+ "2) ExportAllXHTML\n"
							+ "3) ExportShortDescriptionXML\n"
							+ "4) ExportShortDescriptionXHTML\n");

					input = Integer.parseInt(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				rc.doExport(input);
			} else if (input == 3) {					
				System.out.println("See you later Alligator");
				doExit = true;
				break;
			} else {
				System.out.println("Invalid Option!!!");
			}				
		}
	}

	public void doImport(int selection) {
		switch (selection) {
		case 1:
			System.out.println("Import an invalid XML file");
			Import("invalid.xml");
			break;
		case 2:
			System.out.println("Import a not well-formed XML file");
			Import("notWellFormed.xml");
			break;
		case 3:
			System.out.println("Import an unknown supplier");
			Import("invalidSupplier.xml");
			break;
		case 4:
			System.out.println("Import a valid and well-formed xml-file (ImportSampleMediaStore)");
			Import("sample_articles_kn_media_store.xml");
			break;
		case 5:
			System.out.println("Import a valid and well-formed xml-file");
			Import("valid.xml");	
			break;
		}
	}
	
	public void doExport(int selection) {
		
		switch (selection) {
		case 1:
			ExportAllXML();
			break;
		case 2:
			ExportAllXHTML();
			break;
		case 3:
			ExportShortDescXML();
			break;
		case 4:
			ExportShortDescXHTML();
			break;
		}
	}
	
	private void Import(String fileName){
		try {
			InputStream stream;
			Response response;
			String message;
			File file;
			file = new File(RESTClient.files + "/" + fileName);
			stream = new FileInputStream(file);

			response = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/import/upload")
					.request(MediaType.TEXT_PLAIN).header("filename", file.getName()).post(Entity.xml(stream));
			message = response.readEntity(String.class);
			System.out.println(message + "\n");

			Thread.sleep(5000);
		} catch (Exception e) {
			System.err.println();
		}
	}
	
	private void ExportAllXHTML() {
		System.out.println("Export all XHTML-Data");	

		InputStream xhtmlAll = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/export/all")
				.request(MediaType.APPLICATION_XHTML_XML).header("Content-Type", MediaType.APPLICATION_XHTML_XML)
				.get(InputStream.class);

		if (this.writeFile("allxHTML.xml", xhtmlAll)) {
			System.out.println("Data saved!");
		} else {
			System.out.println("Data not saved!");
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void ExportAllXML() {
		System.out.println("Export all XML-Data");

		InputStream xmlAll = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/export/all")
				.request(MediaType.APPLICATION_XML).header("Content-Type", MediaType.APPLICATION_XML)
				.get(InputStream.class);

		if (this.writeFile("allXML.xml", xmlAll)) {
			System.out.println("Data saved");
		} else {
			System.out.println("Data not saved!");
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void ExportShortDescXML() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		try {
			System.out.print("Short description:");
			 input = br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Export all data with short description " + input + " in XML");

		InputStream xmlShortDesc = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/export/short/"+input)
				.request(MediaType.APPLICATION_XML).header("Content-Type", MediaType.APPLICATION_XML)
				.get(InputStream.class);

		if (this.writeFile("shortDescXML.xml", xmlShortDesc)) {
			System.out.println("Data saved");
		} else {
			System.out.println("Data not saved!");
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void ExportShortDescXHTML() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		try {
			System.out.print("Short description:");
			 input = br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Export all Data with short description " + input + " in XHTML");

		InputStream xmlShortDesc = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/export/short/"+input)
				.request(MediaType.APPLICATION_XHTML_XML).header("Content-Type", MediaType.APPLICATION_XHTML_XML)
				.get(InputStream.class);

		if (this.writeFile("shortDescXHTML.xml", xmlShortDesc)) {
			System.out.println("Data saved");
		} else {
			System.out.println("Data not saved!");
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
