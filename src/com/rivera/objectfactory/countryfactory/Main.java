package com.rivera.objectfactory.countryfactory;

import com.rivera.objectfactory.UI;

public class Main {

    public static void main(String[] args){
//Fields: name (String),
//        population (int)
//        capital (String)

        System.out.println("Country Factory\n\n");
        String name = UI.readString("What is the Country name?");
        int population = UI.readInt("What is the Country population?", 0, 1000000000);
        String capital = UI.readString("What is the capital?");

        Country generatedCountry = new Country (name, population, capital);

        System.out.println(generatedCountry);
    }
}
