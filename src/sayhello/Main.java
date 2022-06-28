package sayhello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Create a tool for reading user input and name it reader
        Scanner scanner = new Scanner(System.in); //system.in is to capture what the user is typing in the terminal
        //Print "Name: " in the terminal
        System.out.print("Enter your Name: ");
        //Read the string written by the user, and assign it
        //to memory "String name =
        String name = scanner.nextLine().trim(); //next float, next double, strings: next,: next line: allows you to read all the text in the lines. Trim: removes the extra spaces before the text
        /* Print the message written by the user = (string that was given as input)" */
        System.out.println("Hello, nice to meet you" + " " + name);

    }
}







