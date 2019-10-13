package com.company;
import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import java.util.Set;
public class Tariff {
    private Set<Tariff> tariff;
    private TariffHandler sh;
    private XMLReader reader;

    public Tariff() throws IOException {
        sh = new TariffHandler();
        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(sh);
        } catch (SAXException e) {
            System.err.print("ошибка SAX парсера: " + e);
        }

    }

    public Set<Tariff> getTariff() {
        return tariff;
    }

    public void tariff(String fileName) {
        try {
            reader.parse(fileName);
        } catch (SAXException e) {
            System.err.print("ошибка SAX парсера: " + e);
        } catch (IOException e) {
            System.err.print("ошибка I/О потока: " + e);
        }
        tariff = sh.getTariff();
    }
}


