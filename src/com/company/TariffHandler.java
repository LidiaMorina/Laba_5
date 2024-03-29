package com.company;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**/
public class TariffHandler extends DefaultHandler {
    private Set <Tariffs> tariffs;
    private Tariffs current = null;
    private EnumSet<TariffEnum> withText;
    private TariffEnum currentEnum = null;

    public TariffHandler(){
        tariffs = new HashSet<Tariffs>();
        withText = EnumSet.range(TariffEnum.TATIFF_NAME, TariffEnum.PAYMENTCONNECTION);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if ("tatiff_name".equals(localName)) {
            current = new Tariffs();
            current.setTatiff_name(attributes.getValue(0));
        }else{
            TariffEnum temp = TariffEnum.valueOf(localName.toUpperCase());
            if (withText.contains(temp)){
                currentEnum = temp;
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if("tatiff_name".equals(localName)){
            tariffs.add(current);
        }
    }

    //принимает содержимое тегов
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String s = new String(ch, start, length).trim();
        if (currentEnum != null){
            switch (currentEnum){
                case OPERATOR:
                    current.setOperator(s);
                    break;
                case PAYROLL:
                    current.setPayroll(s);
                    break;
                case WITHINNETWORK:
                    current.getCallPrices().setWithinNetwork(s);
                    break;
                case OUTSIDENETWORK:
                    current.getCallPrices().setOutsideNetwork(s);
                    break;
                case FIXEDPHONE:
                    current.getCallPrices().setFixedPhone(s);
                    break;
                case SMS_PRICE:
                    current.setSmsPrices(s);
                    break;
                case FAVORITENUMBER:
                    current.getParameters().setFavoriteNumber(s);
                    break;
                case TARIFFICATION:
                    current.getParameters().setTariffication(s);
                    break;
                case PAYMENTCONNECTION:
                    current.getParameters().setPaymentConnection(s);
                    break;
                case TATIFF_NAME:
                    current.setTatiff_name(s);
                    break;
                case CALL_PRICES:
                    current.getCallPrices();
                    break;
                case PARAMETERS:
                    current.getParameters();
                    break;
                default:
                    throw new EnumConstantNotPresentException( currentEnum.getDeclaringClass(),currentEnum.name());
            }
        }
       currentEnum = null;
    }


    public Set<Tariffs> getTariff() {
        return tariffs;
    }
}
