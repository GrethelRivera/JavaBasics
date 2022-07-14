package com.rivera.objectfactory.fruitfactory;

import com.rivera.objectfactory.UI;

public class Main {

    public static void main(String[] args) {
        // Fields: name (String), color (String), hasSeeds (boolean)

        System.out.println("Fruit Factory\n\n");

        String name = UI.readString("What is the name of the fruit?");
        String color = UI.readString("What is the color of the fuit?");
        boolean hasSeeds = UI.readBoolean("Does it have seeds?");

        Fruit generatedFruit = new Fruit(name, color, hasSeeds);

        System.out.println(generatedFruit);
    }
}
