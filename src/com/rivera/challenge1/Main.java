package com.rivera.challenge1;


public class Main {
    public static void main(String[] args) {  // main method of your main class
        String firstName = "Grethel";
        String lastName = "Rivera";

        String fullName = createFullName(firstName, lastName);

        NameGenerator nameGen = new NameGenerator();

        String generateFullName = nameGen.generateFullName("John", "Doe");

        System.out.println(fullName);
        System.out.println(createFullName("First", "Last"));
        System.out.println(generateFullName);

    }

    private static String createFullName (String firstName, String lastName){
        return firstName + " " + lastName;

    }


        }

