package de.htwg_konstanz.ebus.wholesaler.main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;

import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;

// TODO: Auto-generated Javadoc
/**
 * The Class XMLTransformer.
 */
public class XMLTransform {
	
	
	/**
	 * generate .xhtml file
	 *
	 * @param document the document
	 * @return the stream result
	 */
	public InputStream toXHTML(Document document){
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		Result outputTarget = new StreamResult(outputStream);
		InputStream inputStream = null;
		try {
			StreamSource streamSource = new StreamSource(Constants.XSLT_Path);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer(streamSource);
			transformer.transform(new DOMSource(document), outputTarget);
			inputStream = new ByteArrayInputStream(outputStream.toByteArray());
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return inputStream;
	}
	
	/**
	 * generates .xml file
	 *
	 * @param document the document
	 * @return the stream result
	 */
	public InputStream toXML(Document document){
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		Result outputTarget = new StreamResult(outputStream);
		InputStream inputStream = null;
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.transform(new DOMSource(document), outputTarget);
			inputStream = new ByteArrayInputStream(outputStream.toByteArray());
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		return inputStream;
	}
}
