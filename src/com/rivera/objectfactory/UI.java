//package com.rivera.objectfactory;
//
//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class UI {
//
//    //one method for each type of data
//    //all static methods
//    //take in a question, and return a piece of data the specific type requested
//
//    private static Scanner scanner = new Scanner(System.in);
//
//        //String, short, double, int boolean
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
////    public static String readString(String question) {
////        while (true) {
////            System.out.println(question);
////            String input = scanner.nextLine();
////            if (!input.trim().equals("")) {
////                return input; //can also use break to end the loop.
////            }
////        }
////    }
//
//    public static boolean readBoolean(String question) {
//        while (true) {
//            try {
//                System.out.println(question + "\n(true/false): ");
//                boolean input = scanner.nextBoolean();
//                scanner.nextBoolean();
//                return input;
//            } catch (Exception exception) {
//                System.out.println("Inout must be true OR false");
//                scanner.nextLine();
//            }
//        }
//    }
//}
//
//    public static short readShort (String  question) {
//        while (true) {
//            try {
//                System.out.println(question + "\n(true/false): ");
////                short input = scanner.nextBoolean();
//                scanner.nextBoolean();
//                return input;
//            } catch (Exception exception) {
//                System.out.println("Inout must be true OR false");
//                scanner.nextLine();
//            }
//        }
//    }
//}