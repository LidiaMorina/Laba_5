package com.company;
/*класс содержащий элементы Цен на звонки: внутри сети, вне сети,
                                           стационарный телефон*/
public class CallPrices {

    private String withinNetwork;
    private String outsideNetwork;
    private String fixedPhone;

    public String toString(){
        return "\nЦена на звонки внутри сети: "+ withinNetwork + "\nЦена на звонки вне сети: " + outsideNetwork +"\nЦена на стационарные теелфоны: "+ fixedPhone;
    }


    /*геттеры и сеттеры элементов*/
    public String getWithinNetwork() {
        return withinNetwork;
    }

    public void setWithinNetwork(String withinNetwork) {
        this.withinNetwork = withinNetwork;
    }

    public String getOutsideNetwork() {
        return outsideNetwork;
    }

    public void setOutsideNetwork(String outsideNetwork) {
        this.outsideNetwork = outsideNetwork;
    }

    public String getFixedPhone() {
        return fixedPhone;
    }

    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone;
    }
}


