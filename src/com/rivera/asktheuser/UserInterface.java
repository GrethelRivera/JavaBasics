package com.rivera.asktheuser;


import java.util.Scanner;

public class UserInterface {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) { //main method  (1st piece)
        System.out.println(" Welcome to the Pokemon Championship Series! Let's get you registered and ready to go! \n\n");

        String pokemonName = askPokemonName();
        short pokemonCardNumber = askPokemonCardNumber();
        byte pokemonSpeed = askPokemonSpeed();
        float pokemonWeight = askPokemonWeight();
        double hitPoints = askHitPoints();
        int numBattles = askNumberBattles();
        boolean internationalCompetition = askCompeteInternationally();
        long creditCard = askCreditCard();


        System.out.println("FINAL REGISTRATION REPORT: \nNAME: " + pokemonName + "\nSpeed:" + pokemonSpeed + ""); // second piece to update
        User generatedUser = new User(pokemonName, numBattles);
    }

    private static String askPokemonName() {  // third piece to update
        System.out.println("Type in your Pokemon's \nName: ");
        String pokemonName = scanner.nextLine();
        System.out.println("Wow we are excited to have " + pokemonName + " " + "compete!");
        return pokemonName;
    }

    private static short askPokemonCardNumber() { // 4 spots
        System.out.println("Enter your Pokemon's card number \nNO: ");
        short pokemonCardNumber = scanner.nextShort();
        scanner.nextLine();
        System.out.println("" + pokemonCardNumber + " " + " matches our records!");
        return pokemonCardNumber;
    }

    private static byte askPokemonSpeed() { // 5-200
        System.out.println("Enter your Pokemon's speed \nSpeed: ");
        byte pokemonSpeed = scanner.nextByte();
        scanner.nextLine(); // clears the \n ( new line character) from the Input stream (System.in)
        System.out.println("Your pokemon's speed of " + pokemonSpeed + "determines who will strike first.");
        return pokemonSpeed;
    }

    private static float askPokemonWeight() {
        System.out.println("How many pounds does your Pokemon weigh? \nWeight: ");
        float pokemonWeight = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Thanks for providing your pokemon's weight of:  " + pokemonWeight + "");
        return pokemonWeight;
    }

    private static double askHitPoints() {
        System.out.println("What is your Pokemon's HP? \nHP: ");
        double hitPoints = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Assigning " + hitPoints + " " + " of Hit Points.");
        return hitPoints;
    }

    private static int askNumberBattles() {
        System.out.print("How many battles has your pokemon competed in? \nBattles: ");
        int numBattles = scanner.nextInt();
        scanner.nextLine();
        System.out.println("" + numBattles + "is impressive!");
        return numBattles;
    }

    private static boolean askCompeteInternationally() {
        System.out.print("Would you like to compete internationally? \n True/False: ");
        boolean internationalCompetition = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("We will set you up according to your " + internationalCompetition + " " + "preference.");
        return internationalCompetition;
    }

    private static long askCreditCard() {
        System.out.print("Please enter your 16 digit Credit Card number for payment. \nCredit Card Number: ");
        long creditCard = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Your credit card number: " + creditCard + "will be charged $100.");
        return creditCard;
    }
}


//scanner.nextln(); after asking anything that is not a string will help print "0"


//        System.out.println("Final Report:\Name: " + name + "\nAge:" + age);
//        User generatedUser = new User(name, (byte) 300, age, mostExpensiveTicket:1000);
//        scanner.next(); // clears the \n (new line character) from the Input Stream (system.in)


//           ThreadLocalRandom random = ThreadLocalRandom. current(); int rand = random. nextInt(1, 11);


//    Random rand = new Random(); //instance of random class
//    int upperbound = 150;
//    int int_random = rand.nextInt(upperbound);
//        System.out.println("Your confirmation number is" + (upperbound-1) + "");