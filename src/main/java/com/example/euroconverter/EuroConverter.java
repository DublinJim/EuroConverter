package com.example.euroconverter;

public class EuroConverter {
    private final double euro = 1.00;
    private final double USD = 1.265466546;
    private final double GBP = 0.865465468;
    private final double yen = 124.00;

    public double convert(double euro, double currency) {
        currency = euro * currency;
        currency = Math.round(currency * 100) / 100.0;
        return currency;
    }

    public double getUSD() {
        return USD;
    }

    public double getGBP() {
        return GBP;
    }

    public double getYen() {
        return yen;
    }

    public double getEuro() {
        return yen;
    }

}
