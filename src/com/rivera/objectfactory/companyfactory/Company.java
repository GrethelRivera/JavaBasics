package com.rivera.objectfactory.companyfactory;

public class Company {
//    Fields: name (String), yearEstablished (short), marketCap (double)

    //CONSTRUCTORS
    private String name;
    private short yearEstablished;
    private double marketCap;

    //getters & setters

    public Company(String name, short yearEstablished, double marketCap) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.marketCap = marketCap;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short yearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(short yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public double marketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    // toString()
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Company{");
        sb.append("name='").append(name).append('\'');
        sb.append(", yearEstablished=").append(yearEstablished);
        sb.append(", marketCap=").append(marketCap);
        sb.append('}');
        return sb.toString();
    }
}
