package com.rivera.mosh;

//import jdk.swing.interop.SwingInterOpUtils;
//
//import java.awt.*;
//import java.lang.invoke.ConstantCallSite;
//import java.text.NumberFormat;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.Locale;
//import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
final byte Months_IN_YEAR = 12;
final byte PERCENT = 100;

Scanner scanner = new Scanner(System.in);
int principal = scanner.nextInt();

System.out.println("Annual Interest Rate: ");
float annualInterest = scanner.nextFloat();
float monthlyInterest = annualInterest / PERCENT / Months_IN_YEAR;


System.out.println();








//      Project: Mortgage Calculator

//      Example 16: Reading Input

//        Sample 3: Prints first and Last name and removes extra space
//        Scanner scanner = new Scanner(System.in);  //  capture data from terminal. ".out" prints data in the terminal
//        System.out.print("Name: "); // prints question
//        String name  = scanner.nextLine().trim();  // chaining methods
//        System.out.println("You are" + " " +  name);

//        Sample 2:  Prints first name
//        Scanner scanner = new Scanner(System.in);  //  capture data from terminal. ".out" prints data in the terminal
//        System.out.print("Name: "); // prints question
//        String name  = scanner.next();  // scans string
//        System.out.println("You are" + " " +  name);

//        Sample 1:
//        Scanner scanner = new Scanner(System.in);  //  capture data from terminal. ".out" prints data in the terminal
//        System.out.print("Age: "); // prints question //println adds another line below
//        byte age = scanner.nextByte();  // scanner object can be paired with many methods
//        System.out.println("You are" + " " +  age);


//        Example 15: Formatting Numbers

//         Sample 2: method chaining
//         String result =  NumberFormat.getPercentInstance().format(0.1);
//         System.out.println(result);

//         Sample 1:
//         NumberFormat currency = NumberFormat.getCurrencyInstance();
//         String result = currency.format(1234.891);
//         System.out.println(result);

//        NumberFormat currency = new NumberFormat () - can't create an instance because its abstract

//        Example 14: The Math Class

//        Sample 3:
//        int result = (int) Math.ceil(1.1F);  // smallest integer that's greater than or equal to 1.1 which is  2.
//        int result = (int) Math.floor(1.1F); // returns 1. largest integer equal to this number
//        int result = (int) Math.max(1, 2); // greater of both values
//        int result = (int) Math.min(1, 2); // returns a random number
//        int result = (int) Math.round(Math.random() * 100); //  number between 0-100
//        int result = (int) (Math.random() * 100); //  number between 0-100
//        System.out.println(result);

//         Sample 2: Ceiling Method
//         int result = Math. round(1.1F);
//         System.out.println(result);

//         Sample 1: round Method
//         int  result = Math. round(1.1F);
//         System.out.println(result);




//       Example 13: Casting
//       Explicit Casting = can only happen within capable type

//        Sample 3:
//        String x = "1.1";   //includes a decimal
//        double y = Double.parseDouble(x) + 2;

//        Sample 2:
//        String x = "1";
//        int y = Integer.parseInt(x) + 2; //converting a string to a number
//        Short.parseShort() // int
//        Float.parseFloat()
//        System.out.println(y);

//        Sample 1:
//        double x = 1.1;
//        double y = (int) x + 2;
//        System.out.println(y);


//        Sample 1: Implicit casting = automatic conversion
//        // byte  > short > int > long > float > double (compatible because they are all numbers)
//        double x = 1.1;
//        double y =  x + 2;
//        System.out.println(y);

//        short x = 1;
//        int y = x + 2;   // short variable stored in integer
//        System.out.println(y);

//        Exercise 12: Order of Operations

//        int x = (10 + 3) * 2;  PEMDAS for order of operations
//        System.out.println(x);


//        Exercise 12: Arithmetic Expressions
//        Sample 2:
//        int x= 1;
//        x += 2;
//        x /= x + 2;  /= compound assignment operators
//        int y = x++; //y=1
//        int y = ++x; //y=2
//        x++;
//        System.out.println(x);
//        System.out.println(y);

//        Sample 1:
//        double result = (double) 10 / (double) 3;   // double is an expression because it produces a value
//        System.out.println(result);

//        Exercise 11:Constants
//        final float PI = 3.14F;  // cant reassign a "final" constant. not mutable.  (mutability allows change)

//        Exercise 10: Multi-Dimensional Arrays
//        Sample 2:
//        int [][] numbers = {{1, 2, 3}, {4, 5, 6}};    //2 rows 3 columns
//        System.out.println(Arrays.deepToString(numbers));

//        Sample 1:
//        int [][] numbers = new int [2] [3];    //2 rows 3 columns
//        numbers [0] [0] = 1;
//        System.out.println(Arrays.deepToString(numbers));

//        Exercise 9: Arrays
//        Sample 2:
//        int [] numbers = { 2, 3, 4, 5, 1, 4};
//        Arrays.sort(numbers);
////      System.out.println(numbers.length); // length of the array. Arrays have a Fixed length.
//        System.out.println(Arrays.toString(numbers));

//        Sample 1:
//        int [] numbers = new int[5];  // arrays are reference types, so we need to add the "new operator". How many items do we want to store = 5
//        numbers [0] = 1; //initializing items. Default initialization is 0
//        numbers [1] = 2;
////      Arrays.toString(numbers); arrays. add a utility type. insert this line into the print line.
//        System.out.println(Arrays.toString(numbers));

//        Exercise 8: Escape Sequences
//        String message = "Hello \"Mosh\""; // \ symbol Escapes the double quote and allows the double quotes
//        String message = "c:\\Windows\\...";
//        String message = "c:\nWindows\\...";   \n adds a new line
//        System.out.println(message);


//        Exercise 7: Strings
//        String message = "  Hello World  " + "!!";
//        System.out.println(message.endsWith("!!") ); // prints true
//        System.out.println(message.length()); // checks the length of the input of characters
//        System.out.println(message.indexOf("H")); //finds the index of a character. Prints "0" .
//        System.out.println(message.indexOf("Sky")); //It returns -1 if it doesn't find the character or string
//        System.out.println(message.replace("!", "*")); //parameters is how we define our methods "!" arguments is what we actually pass through "*"
//        System.out.println(message); // messages doesn't get replaced it gets modified . Strings are not changeable (immutable)
//        System.out.println(message.toLowerCase()); // prints all lower case
//        System.out.println(message.toUpperCase()); // prints all upper case
//        System.out.println(message.trim()); //deletes unnecessary spaces


//       Exercise 6: Reference type are copied by their references.
//        Point point1 = new Point(1,1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);

//        Exercise 5: Primitive Types vs Reference type. Primitive example. copied by their value.
//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);

//        Exercise 4: Using Reference to store complex objects
//        byte age = 30;
//        Date now = new Date (); // now is used to create an instance of a class " new Date". Date adds line 3.
//        System.out.println(now); //no quotes show the value


//        Exercise 3: Using Primitive types to store simple values (numbers,characters, booleans)
//        byte age = 30;
//        int viewsCount = 123456_789;
//        float price = 10.99F;
//        char letter = 'A'; //represents one character not a string.
//        boolean isEligible = false;


//        Exercise 2:Initializing a variable. Reassigning a vale.
//        int myAge = 30; //initializing a variable. Assigning a value
//        int herAge =myAge;
//        System.out.println(herAge); //write the code.

//        Exercise1: write a code
//        System.out.println("Hello World");
    }
}
