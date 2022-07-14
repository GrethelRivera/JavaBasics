package com.rivera.objectfactory.animalfactory;


import com.rivera.objectfactory.UI;
import com.rivera.objectfactory.airplanefactory.Airplane;

public class Main {

    public static void main(String[] args) {
//        private String species;
//        private short legs;
//        private boolean isTerrestrial;
//


        System.out.println(("Animal Factory\n\n"));

        String species = UI.readString("What is the species name");
        short legs = UI.readShort("How many legs does the species have?", (short) 0, (short) 300);
        boolean isTerrestrial = UI.readBoolean("Is it Terrestrial?");


        Animal generatedAnimal = new Animal(species, legs, isTerrestrial);

        System.out.println(generatedAnimal);

    }
}


