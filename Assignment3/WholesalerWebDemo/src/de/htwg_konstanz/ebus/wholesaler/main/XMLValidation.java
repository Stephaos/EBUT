package de.htwg_konstanz.ebus.wholesaler.main;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import de.htwg_konstanz.ebus.wholesaler.demo.util.Constants;

// TODO: Auto-generated Javadoc
/**
 * The Class XMLValidator.
 */
public class XMLValidation {
	
	/**
	 * returns if the inputfile is a valid xml file.
	 *
	 * @param document the document
	 * @return true, if is valid
	 */
	public boolean isValid(Document document){
		try {
			// Create a SchemaFactory capable of understanding W3C schemas
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(Constants.XSD_Path));
			// Create a Validator object, which can be used to validate
			Validator validator = schema.newValidator();
			validator.validate(new DOMSource(document));
			return true;
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
