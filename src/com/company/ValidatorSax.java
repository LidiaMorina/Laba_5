package com.company;
import java.io.*;
import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;
/*класс ждя проверки валидности XML документа с XSD схемой*/
public class ValidatorSax {

    public void validatorSax() throws SAXException {
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        String fileName = "tariff.xml";
        String schemaName = "tariff_xsdShema.xsd";
        Schema schema = null;
        SchemaFactory factory = SchemaFactory.newInstance(language);

       // try {
            schema = factory.newSchema(new File(schemaName));
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setSchema(schema);

       //     SAXParser parser = spf.newSAXParser();
            System.out.println(fileName + " is valid");
     /*   } catch (ParserConfigurationException e) {
            System.err.println(fileName + " config error: " + e.getMessage());
        } catch (SAXException e) {
            System.err.println(fileName + " SAX error: " + e.getMessage());
        }
*/
    }

}
