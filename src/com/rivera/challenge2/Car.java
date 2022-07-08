package com.rivera.challenge2;

public class Car {

//    declare the following fields
//    make (String
//    model (String)
//    mileage (int)
//    gasTankPercent (float)
//    Define each field as "public"

    private String make;
    private String model;
    private int mileage;
    private float gasTankPercent; // float captures the data


    //Create a standard constructor for the Car class. Code -Generate- Constructor - -select all


    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;

    }
//getters and setters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public float getGasTankPercent() {
        return gasTankPercent;
    }
//generate toString
    @Override
    public String toString() {
//        return "Car{" +
//                "make='" + make + '\'' +
//                ", model='" + model + '\'' +
//                ", mileage=" + mileage +
//                ", gasTankPercent=" + gasTankPercent +
//                '}';
        return "Make: " + make + ", Model: " + model + ", Mileage: " + mileage + ", Gas Tank: " + gasTankPercent*10 + '%';

    }
}
