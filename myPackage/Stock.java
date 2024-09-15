package myPackage;

import lombok.Setter;

public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    @Setter
    private double currentPrice;

    public double getChangePercent(){
        double sum = currentPrice - previousClosingPrice;
        return sum/previousClosingPrice;
    }

    public Stock(String symbol, String name, double previousClosingPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
    }
}
