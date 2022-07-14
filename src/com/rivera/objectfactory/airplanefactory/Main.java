package com.rivera.objectfactory.airplanefactory;

import com.rivera.objectfactory.UI;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Airplane> hanger = new ArrayList<>();

        System.out.println("Airplane Factory\n\n"); //on top to only run once

        //Creating the Menu:
        while (true) {
            System.out.println("\nMenu\n" + "".repeat(20));  //.repeat helps repeat this Menu 20 times
            System.out.println("1) Create A Plane");
            System.out.println("2) Show Hanger");
            System.out.println("3) Exit The Program");

            //User makes a choice:

            byte menuChoice = UI.readByte("Choose an Option", (byte) 1, (byte) 3); //explicit casting


            if (menuChoice == 3) break;
            else if (menuChoice == 2) {
                if (hanger.size() == 0) {
                    System.out.println("\nNo Airplane In Hanger\n");
                    continue;
                }
                //show hanger
                System.out.println("-".repeat(20));
                System.out.println("\nAIRPLANE HANGER\n");
                for (int i = 0; i < hanger.size(); i++) {
                    System.out.println(i + 1 + ")\n " + hanger.get(i) + "\n");
                }
                System.out.println("-".repeat(20));
                continue; // Exists current loop and continues the loop that it's closest to

            }

            //If the code gets to this point, the user will create a plane
            Airplane generatedAirplane = createAirplane();
            hanger.add(generatedAirplane);
            System.out.println("\n\nCREATED AIRPLANE:\n" + generatedAirplane);

        }

        System.out.println("\nThank you for using the program...");

    }

    private static Airplane createAirplane() {

        String modelName = UI.readString("What is the model name");
        String tailNumber = UI.readString("What is the tail number");
        short passengerCap = UI.readShort("What is the plane passenger capacity", (short) 0, (short) 300);
        int marketValue = UI.readInt("What is the plane's market value");
        double gasTank = UI.readDouble("What is the current gas tank percent ( as a decimal)", 0, 1);
        boolean isFlying = UI.readBoolean("Is the plane flying?");

        return new Airplane(modelName, tailNumber, passengerCap, marketValue, gasTank, isFlying);

    }
}
