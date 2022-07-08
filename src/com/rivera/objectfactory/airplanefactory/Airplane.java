package com.rivera.objectfactory.airplanefactory;

public class Airplane {

    //modelName, tailNumber, passengerCap, marketValue, gasTank, isFlying
    private String modelName;
    private String tailNumber;
    private short passengerCap;
    private int marketValue;
    private double gasTank;
    private boolean isFlying;


//generate - constructors

    public Airplane(String modelName, String tailNumber, short passengerCap, int marketValue, double gasTank, boolean isFlying) {
        this.modelName = modelName;
        this.tailNumber = tailNumber;
        this.passengerCap = passengerCap;
        this.marketValue = marketValue;
        this.gasTank = gasTank;
        this.isFlying = isFlying;
    }
}

