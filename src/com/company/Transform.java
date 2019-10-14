package com.company;
import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
//import javax.xml.transformer.Transformer;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*преобразоавние в HTML документ*/
public class Transform {

    public void transform(){
        try {

            TransformerFactory tFactory=TransformerFactory.newInstance();

            Source xslDoc=new StreamSource("xsl_tariff.xsl");
            Source xmlDoc=new StreamSource("tariff.xml");

            String outputFileName="html_tariff.html";

            OutputStream htmlFile=new FileOutputStream(outputFileName);
            Transformer trasform=tFactory.newTransformer(xslDoc);
            trasform.transform(xmlDoc, new StreamResult(htmlFile));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (TransformerConfigurationException e)
        {
            e.printStackTrace();
        }
        catch (TransformerFactoryConfigurationError e)
        {
            e.printStackTrace();
        }
        catch (TransformerException e)
        {
            e.printStackTrace();
        }
    }


}
