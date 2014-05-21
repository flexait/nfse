package br.com.flexait.nfse.validation;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class NfseValidator {
	
	private InputStream xml;
	
	public NfseValidator from(String xml) {
		this.xml = parseStringToIS(xml);
		return this;
	}

	private ByteArrayInputStream parseStringToIS(String xml) {
		return new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
	}
	
	public void validate() throws Exception {
		DOMSource document = createDocument();
	    Validator validator = createValidator();
	    
		validator.validate(document);
	}

	private Validator createValidator() throws SAXException {
		SchemaFactory factory = SchemaFactory
	            .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

	    factory.setResourceResolver(new LSResourceResolverImpl());

	    InputStream xsd = getClass().getClassLoader().getResourceAsStream("v2.01.xsd");
		Source schemaFile = new StreamSource(xsd);
	    Schema schema = factory.newSchema(schemaFile);

	    Validator validator = schema.newValidator();
		return validator;
	}

	private DOMSource createDocument() throws ParserConfigurationException,
			SAXException, IOException {
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
	    builderFactory.setNamespaceAware(true);

	    DocumentBuilder parser = builderFactory
	            .newDocumentBuilder();

	    Document document = parser.parse(xml);
		return new DOMSource(document);
	}
}
