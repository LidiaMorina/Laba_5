package com.company;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;

/*Гланый метод main на выходе вывод в консоль и создание отсортированного html документа*/

public class Main {

    public static void main(String[] args)throws ParserConfigurationException, SAXException, IOException {

        //вывод в консоль
        Tariff saxTariff = new Tariff();
        saxTariff.tariff("tariff.xml");
        Set<Tariffs> ttt = saxTariff.getTariff();
        System.out.println(ttt);

        //преобразоавние в HTML документ
        Transform transform = new Transform();
        transform.transform();



    }
}
