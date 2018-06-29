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

//	public static void main(String[] args) {
//		
//		Client client = ClientBuilder.newClient();
//		
//		// Trivial get
//		String request = "Give me this text back";
//		Response res = client.target("http://localhost:8080/WholesalerWebDemo/rest/hello/"+request)
//				.request(MediaType.TEXT_PLAIN)
//				.get();
//		
//		String response = res.readEntity(String.class);
//		System.out.println(response);
//		
//		// Easy get
//		int num = 2;
//		Response res2 = client.target("http://localhost:8080/WholesalerWebDemo/rest/hello/square/"+num)
//				.request(MediaType.TEXT_PLAIN)
//				.get();
//		
//		String response2 = res2.readEntity(String.class);
//		System.out.println(response2);
//		
//		// Easy post		
//		Response res3 = client.target("http://localhost:8080/WholesalerWebDemo/rest/hello/squareroot")
//				.request(MediaType.TEXT_PLAIN)
//				.post(Entity.entity(25, MediaType.TEXT_PLAIN));
//		String response3 = res3.readEntity(String.class);
//		System.out.println(response3);
//
//	}

		
		public static final String files = "C:/Users/Steph/eclipse-workspace/EBUT/Assignment4/JAXRSClient/files";
	
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
								+ "3) ImportHtmlFileWithValidAndWellFormedXML\n"
								+ "4) ImportValidHtmlFile\n"
								+ "5) ImportUnknownSupplier\n"
								+ "6) ImportValidAndWellFormedXML\n");
						
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
								+ "1) ExportAllXHTML\n"
								+ "2) ExportAllXML\n");

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
				ImportInvalidXML();
				break;
			case 2:
				ImportNotWellFormedXML();
				break;
			case 3:
				ImportHtmlFileWithValidAndWellFormedXML();
				break;
			case 4:
				ImportValidHtmlFile();
				break;
			case 5:
				ImportUnknownSupplier();
				break;
			case 6:
				ImportValidAndWellFormedXML();	
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
			}
		}

		private void ImportValidAndWellFormedXML(){
			try {
				InputStream stream;
				String message;
				File file;
				System.out.println("Import a valid and well-formed xml-file");
				file = new File(RESTClient.files + "/valid.xml");
				stream = new FileInputStream(file);

				Response valid = this.client.target("http://localhost:8080/WholesalerWebDemo/rest/import/upload")
						.request(MediaType.TEXT_PLAIN).header("filename", file.getName()).post(Entity.xml(stream));

				message = valid.readEntity(String.class);
				System.out.println(message + "\n");
				
				Thread.sleep(5000);
			} catch (Exception e) {
				System.err.println();
			}
		}

		private void ImportUnknownSupplier(){
			try {
				InputStream stream;
				Response response;
				String message;
				File file;
				System.out.println("Import an unknown supplier");
				file = new File(RESTClient.files + "/invalidSupplier.xml");
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

		private void ImportValidHtmlFile(){
			try {
				InputStream stream;
				Response response;
				String message;
				File file;
				System.out.println("Import a valid HTML file");
				file = new File(RESTClient.files + "/validHTML.xhtml");
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

		private void ImportHtmlFileWithValidAndWellFormedXML(){
			try {
				InputStream stream;
				Response response;
				String message;
				File file;
				System.out.println("Import an html-file with valid and well-formed xml, unknown supplier");
				file = new File(RESTClient.files + "/validAndWellFormedXML.html");
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

		private void ImportNotWellFormedXML(){
			try {
				InputStream stream;
				Response response;
				String message;
				File file;
				System.out.println("Import a not well-formed XML file");
				file = new File(RESTClient.files + "/notWellFormed.xml");
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

		private void ImportInvalidXML(){
			try {
				InputStream stream;
				Response response;
				String message;
				File file;
				System.out.println("Import an invalid XML file");
				file = new File(RESTClient.files + "/invalid.xml");
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
