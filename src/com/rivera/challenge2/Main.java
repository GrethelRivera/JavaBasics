package com.rivera.challenge2;

public class Main {
    public static void main(String[] args) {    //main method
//        Make: Camaro 2SS, Model: Chevy, mileage: 10000, gasTankPercent: 0.10
////        Make: Mustang GT Model: Ford, mileage: 30000, gasTankPercent: 0.50
////        Make: Hellcat, Model: Dodge, mileage: 100, gasTankPercent: 0.90

        //Creating Instances
        Car car1 = new Car("Chevy", "Camaro 2SS", 10000, 0.10f);
        Car car2 = new Car("Ford", "Mustang GT", 30000, 0.50f);
        Car car3 = new Car("Dodge", "Hellcat", 100, 0.90f);

        //WET method - not good practice!!!
        // System.out.println(ca1.make + " " + car1.model);
        // System.out.println(car2.make + " " + car2.model);
        // System.out.println(car3.make + " " + car3.model);

        //For Loop
//        Car[] carsArray = {car1, car2, car3};
//        for (int i = 0; i < carsArray.length; i++) {
//            System.out.println(carsArray[i].make + " " + carsArray[i].model);

        // Slightly better - still no use of private fields or toString method
//        Car[] carsArray = {car1, car2, car3};
//        for (int i = 0; i < carsArray.length; i++) {
//            System.out.println(carsArray[i].make + " " + carsArray[i].model);
//          }

     // Slightly better - still no use of private fields or toString method
//        Car[] carsArray = {car1, car2, car3};
//        for (int i = 0; i < carsArray.length; i++) {
//            System.out.println(carsArray[i].getMake() + " " + carsArray[i].getModel());
//          }

        //Best Approach
        Car[] carsArray = {car1, car2, car3};
        for (int i = 0; i < carsArray.length; i++) {
            System.out.println(carsArray[i]);
        }
        }

    }

