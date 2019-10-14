package com.company;
/*инициалищация тегов*/
public enum TariffEnum {

    TARIFF("Tariff"),
    TATIFF_NAME("tatiff_name"),
    NAME("name"),
    OPERATOR("operator"),
    PAYROLL("payroll"),
    CALL_PRICES("call_prices"),
    WITHINNETWORK("withinNetwork"),
    OUTSIDENETWORK("outsideNetwork"),
    FIXEDPHONE("fixedPhone"),
    SMS_PRICE("sms_price"),
    PARAMETERS("parameters"),
    FAVORITENUMBER("favoriteNumber"),
    TARIFFICATION("tariffication"),
    PAYMENTCONNECTION("paymentConnection");

    private  String value;
    private TariffEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

