package com.rivera.objectfactory.airplanefactory;

import java.util.StringJoiner;

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

    public String getModelName() {
        return modelName;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public short getPassengerCap() {
        return passengerCap;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public double getGasTank() {
        return gasTank;
    }

    public boolean isFlying() {
        return isFlying;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("Model: '").append(modelName).append('\'');
        sb.append("\nTail Number: '").append(tailNumber).append('\'');
        sb.append("\nPassenger Cap: ").append(passengerCap);
        sb.append("\nPrice: ").append(marketValue);
        sb.append("\nFuel Tank: ").append(gasTank*100).append('%');
        //(condition)? (if true, do this) : Ternary Operator
        sb.append("\nThe plane is ").append(isFlying ? "35,000 ft in the air!" : " on the ground"); // used for distinctive values

        return sb.toString();
    }
}


