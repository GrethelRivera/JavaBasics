package com.rivera.objectfactory.companyfactory;

import com.rivera.objectfactory.UI;

public class Main {

    public static void main(String[] args) {

        System.out.println("Company Factory\n\n");

        String name = UI.readString("What is the Company name?");
        short yearEstablished = UI.readShort("What year was the company established?", (short) 1800, (short) 2022);
        double marketCap = UI.readDouble("What is the market cap?(as a decimal)", 0, 1);

        Company generatedCompany = new Company(name, yearEstablished, marketCap);

        System.out.println(generatedCompany);
    }
}
