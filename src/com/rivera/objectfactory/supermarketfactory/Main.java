package com.rivera.objectfactory.supermarketfactory;

import com.rivera.objectfactory.UI;
import com.rivera.objectfactory.airplanefactory.Airplane;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Supermarket> list = new ArrayList<>();

        System.out.println("Supermarket Shopping List\n\n"); //only runs once

        //Creating the Menu:
        while (true) {
            System.out.println("\nMenu\n" + "".repeat(20));  //.repeat helps repeat this Menu 20 times
            System.out.println("----- Shopping List------");
            System.out.println("1) Create A Shopping List");
            System.out.println("2) Show List");
            System.out.println("3) Exit The Program");


            //User makes a choice: (1,2,3)

            byte menuChoice = UI.readByte("Choose an Option", (byte) 1, (byte) 3); //explicit casting

            if (menuChoice == 3) break;
            else if (menuChoice == 2) {
                if (list.size() == 0) {
                    System.out.println("\nNo Items In Shopping list\n");
                    continue;
                }
                //show list
                System.out.println("-".repeat(20));
                System.out.println("\nShopping List\n");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + 1 + ")\n " + list.get(i) + "\n");
                }
                System.out.println("-".repeat(20));
                continue; // Exists current loop and continues the loop that it's closest to

            }

            //If the code gets to this point, the user will create a list
            Supermarket generatedSupermarket = createSupermarketList();
            list.add(generatedSupermarket);
            System.out.println("\n\nCREATED SUPERMARKET SHOPPING LIST:\n" + generatedSupermarket);

        }

        System.out.println("\nThank you for using the program...");

    }


    private static Supermarket createSupermarketList () {

            String dairy = UI.readString("Dairy Items:");
            String vegetables = UI.readString("Vegetable Items:");
            boolean checkout = UI.readBoolean("Are you ready to checkout?");

            Supermarket generatedSupermarket = new Supermarket(dairy, vegetables, checkout);
            return new Supermarket(dairy, vegetables, checkout);
        }
    }

