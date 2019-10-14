package com.company;
import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import java.util.Set;

public class Tariff {
    private Set<Tariffs> tariff;
    private TariffHandler th;
    private XMLReader reader;


    public Tariff() throws IOException {
        //создадие SAX-анализатора
        th = new TariffHandler();
        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(th);
        } catch (SAXException e) {
            System.err.print("ошибка SAX парсера: " + e);
        }
    }

    public Set<Tariffs> getTariff() {
        return th.getTariff();
    }

    /*разбор XML-документа*/
    public void tariff(String fileName) {
        try {
            reader.parse(fileName);
        } catch (SAXException e) {
            System.err.print("ошибка SAX парсера: " + e);
        } catch (IOException e) {
            System.err.print("ошибка I/О потока: " + e);
        }

        tariff = getTariff();
    }
}


