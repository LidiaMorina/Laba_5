package com.company;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.util.Set;
import javax.xml.parsers.ParserConfigurationException;

/*Программа предназначенная для разбора XML-документа и инициализации коллекции
объектов информацией из XML-файла с сортировки объектов c использованием SAX-парсера
 на выходе: консольный вывод  XML-документа и создание заполненного html файла по xls*/

public class Main {

    public static void main(String[] args)throws ParserConfigurationException, SAXException, IOException {

        //вывод в консоль
        Tariff saxTariff = new Tariff();
        saxTariff.tariff("tariff.xml");
        Set<Tariffs> ttt = saxTariff.getTariff();
        System.out.println(ttt);

        //вызов метода преобразоавние в HTML документ
        Transform transform = new Transform();
        transform.transform();



    }
}
