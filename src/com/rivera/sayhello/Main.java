package com.rivera.sayhello;

import com.rivera.challenge1.NameGenerator; //importing code from another project

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   //main method - this is customizable
        whatIsYourName();
        whatIsYourFullName();
    }

    public static void whatIsYourName () {  //no parameters needed. The user will provide the input no need for parameters
       //1) create a scanner instance
        Scanner scanner = new Scanner(System.in);  // scanner is used to capture user input .in captures user input
        //2) ask the question
        System.out.print("What is your name?\nName: "); //.out prints out data
        //3) Receive user input
        String userInput = scanner.nextLine().trim();
        //4) use the user input
       System.out.println("Hello, nice to meet you " + userInput + ". I hope you have a nice day!");

        }
    public static void whatIsYourFullName () {
        Scanner scanner = new Scanner(System.in);  // scanner is used to capture user input .in captures user input

        System.out.print("What is your first name?\nName: "); //.out prints out data
        String firstName = scanner.nextLine().trim();
        System.out.print("What is your last name?\nName: "); //.out prints out data
        String lastName = scanner.nextLine().trim(); // same code to retrieve and print strings


        String fullName = new NameGenerator().generateFullName(firstName, lastName);

        System.out.println("It is so nice to formally meet you " + fullName);

        }
    }

