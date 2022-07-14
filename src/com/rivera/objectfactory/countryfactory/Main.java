package com.rivera.objectfactory.countryfactory;

import com.rivera.objectfactory.UI;

public class Main {

    public static void main(String[] args){
//Fields: name (String),
//        population (short)
//        capital (String)

        System.out.println(("Country Factory\n\n"));

        String name = UI.readString("What is the Country name?");

        String capital = UI.readString("What is the capital?");

        Country generatedCountry = new Country (name, capital);

        System.out.println(generatedCountry);
    }
}
