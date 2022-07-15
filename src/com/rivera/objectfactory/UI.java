package com.rivera.objectfactory;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class UI {

    //one method for each type of data
    //all static methods
    //take in a question, and return a piece of data the specific type requested


    private static Scanner scanner = new Scanner(System.in);

    //        String, short, double, int boolean
////    public static String readString(String question) {
////        System.out.println(question);
////        String input = scanner.nextLine();
////        if (input.trim().equals("")) {
////            return readSting(question);
////            { else{
////                return input
////            }
////     }
////}
    public static String readString(String question) {
        while (true) {                                         //Incremental looping
            System.out.print(question + "\nInput: ");
            String input = scanner.nextLine().trim();
            if (!input.equals("")) {
                return input; //can also use break to end the loop.
            } else {
                System.out.println("\nYou can not leave the input black\n");

            }
        }
    }

    public static char readChar(String question) {
        while (true) {
            System.out.print(question + "\nInput: ");
            String input = scanner.nextLine().trim();
            if (input.length() == 1) {
                return input.charAt(0);
            } else if (input.equals("")) {
                System.out.println("\nYou can not leave the input black\n");
            } else {
                System.out.println("\n You must only input one character\n");

            }
        }
    }

    public static boolean readBoolean(String question) {
        while (true) {
            try {
                System.out.println(question + "\n(true/false): ");
                boolean input = scanner.nextBoolean();
                scanner.nextLine();
                return input;
            } catch (Exception exception) {
                System.out.println("Input must be true OR false");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String question, int MIN, int MAX) {
        while (true) {                                                           //incremental looping
            try {
                System.out.print(question + "\n(" + MIN + " - " + MAX + "): "); // hard code values
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input <= MAX && input >= MIN) {                               //use <= to capture max input
                    return input;
                } else {
                    System.out.println("Input must be between" + MIN + "and " + MAX);
                }
            } catch (Exception exception) {
                System.out.println("Input must be between" + MIN + " -  " + MAX);
                scanner.nextLine();
            }
        }
    }


    public static short readShort(String question, short MIN, short MAX) {
        while (true) {
            try {
                System.out.print(question + "\n(" + MIN + " - " + MAX + "): "); // hard code values
                short input = scanner.nextShort();
                scanner.nextLine();
                if (input <= MAX && input >= MIN) {
                    return input;
                } else {
                    System.out.println("Input must be between" + MIN + "and " + MAX);
                }
            } catch (Exception exception) {
                System.out.println("Input must be between" + MIN + " -  " + MAX);
                scanner.nextLine();
            }
        }
    }


    public static long readLong(String question, long MIN, long MAX) {
        while (true) {
            try {
                System.out.print(question + "\n(" + MIN + " - " + MAX + "): "); // hard code values
                long input = scanner.nextLong();
                scanner.nextLine();
                if (input <= MAX && input >= MIN) {
                    return input;
                } else {
                    System.out.println("Input must be between" + MIN + "and " + MAX);
                }
            } catch (Exception exception) {
                System.out.println("Input must be between" + MIN + " -  " + MAX);
                scanner.nextLine();
            }
        }
    }


    public static float readFloat(String question, float MIN, float MAX) {
        while (true) {
            try {
                System.out.print(question + "\n(" + MIN + " - " + MAX + "): "); // hard code values
                float input = scanner.nextFloat();
                scanner.nextLine();
                if (input <= MAX && input >= MIN) {
                    return input;
                } else {
                    System.out.println("Input must be between" + MIN + "and " + MAX);
                }
            } catch (Exception exception) {
                System.out.println("Input must be between" + MIN + " -  " + MAX);
                scanner.nextLine();
            }
        }
    }

    public static Byte readByte(String question, float MIN, float MAX) {
        while (true) {
            try {
                System.out.print(question + "\n(" + MIN + " - " + MAX + "): "); // hard code values
                Byte input = scanner.nextByte();
                scanner.nextLine();
                if (input <= MAX && input >= MIN) {
                    return input;
                } else {
                    System.out.println("Input must be between" + MIN + "and " + MAX);
                }
            } catch (Exception exception) {
                System.out.println("Input must be between" + MIN + " -  " + MAX);
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String question, float MIN, float MAX) {
        while (true) {
            try {
                System.out.print(question + "\n(" + MIN + " - " + MAX + "): "); // hard code values
                double input = scanner.nextDouble();
                scanner.nextLine();
                if (input <= MAX && input >= MIN) {
                    return input;
                } else {
                    System.out.println("Input must be between" + MIN + "and " + MAX);
                }
            } catch (Exception exception) {
                System.out.println("Input must be between" + MIN + " -  " + MAX);
                scanner.nextLine();
            }
        }
    }
    //TODO: public static ArrayList<String> readListOfStrings (question, min, max)

    //TODO: public static String selectFromListOfString (question, ArrayList<String>)

    public static ArrayList<String> readListOfStrings(String question, byte min, byte max) {
        ArrayList<String> responses = new ArrayList<>();   // store responses
        System.out.println(question);
        System.out.println("Please enter at least " + min + " inputs and at most " + max + " inputs.");

        for (int i = 0; i < max; i++) {

            String userInput = readString("\n(" + (i + 1) + "/" + max + ")"); //(prints (1/3)
            responses.add(userInput); // stores data in array

            if (responses.size() == max) {
                System.out.println("Maximum number of inputs have been entered.");

            } else if (responses.size() >= min && !readYorNo("Would you like to add more inputs?")) break;
        }
        System.out.println("Your responses have been recorded.");
        return responses;
    }

    public static boolean readYorNo(String question) {

        while (true) {

            String userInput = readString(question + "\n(y/n): ");
            char selection = userInput.toLowerCase().charAt(0);
            if (selection == 'y') return true;
            if (selection == 'n') return false;
            System.out.println("Input must be y or n.");

        }

    }

    public static void main(String[] args) {
        ArrayList<String> responses = readListOfStrings("test", (byte) 1, (byte) 3);
        System.out.println(responses);
    }
}