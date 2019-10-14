package com.company;
/*класс содержащий элементы Парматеров: любимый номер, тарификация,
                                        плата за подключение */
public class Parameters {
    private String favoriteNumber;
    private String tariffication;
    private String paymentConnection;


    public String toString(){
        return "\nНаличие любимого номера: "+ favoriteNumber +"\nТарификация: "+ tariffication +"\nПлата за подключение: "+ paymentConnection;
    }

    /*геттеры и сеттеры параметров*/
    public String getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setFavoriteNumber(String favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    public String getTariffication() {
        return tariffication;
    }

    public void setTariffication(String tariffication) {
        this.tariffication = tariffication;
    }

    public String getPaymentConnection() {
        return paymentConnection;
    }

    public void setPaymentConnection(String paymentConnection) {
        this.paymentConnection = paymentConnection;
    }
}
