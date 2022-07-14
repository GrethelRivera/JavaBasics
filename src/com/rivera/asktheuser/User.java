package com.rivera.asktheuser;

public class User {   // method
    private String pokemonName;
    private int numBattles;
    private short pokemonCardNumber;
    private byte pokemonSpeed;
    private float pokemonWeight;
    private double hitPoints;
    private boolean internationalCompetition;
    private long creditCard;

    public User(String pokemonName, int numBattles, short pokemonCardNumber, byte pokemonSpeed, float pokemonWeight, double hitPoints, boolean internationalCompetition, long creditCard) {  // constructor
        this.pokemonName = pokemonName;
        this.numBattles = numBattles;
        this.pokemonCardNumber = pokemonCardNumber;
        this.pokemonSpeed = pokemonSpeed;
        this.pokemonWeight = pokemonWeight;
        this.hitPoints = hitPoints;
        this.internationalCompetition = internationalCompetition;
        this.creditCard = creditCard;
    }

    public User(String pokemonName, int numBattles) {

    }

    public String pokemonName() { // adding getters and setters below
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public int numBattles() {
        return numBattles;
    }

    public void setNumBattles(int numBattles) {
        this.numBattles = numBattles;
    }

    public short pokemonCardNumber() {
        return pokemonCardNumber;
    }

    public void setPokemonCardNumber(short pokemonCardNumber) {
        this.pokemonCardNumber = pokemonCardNumber;
    }

    public byte pokemonSpeed() {
        return pokemonSpeed;
    }

    public void setPokemonSpeed(byte pokemonSpeed) {
        this.pokemonSpeed = pokemonSpeed;
    }

    public float pokemonWeight() {
        return pokemonWeight;
    }

    public void setPokemonWeight(float pokemonWeight) {
        this.pokemonWeight = pokemonWeight;
    }

    public double hitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean internationalCompetition() {
        return internationalCompetition;
    }

    public void setInternationalCompetition(boolean internationalCompetition) {
        this.internationalCompetition = internationalCompetition;
    }

    public long creditCard() {
        return creditCard;
    }

    public void setCreditCard(long creditCard) {
        this.creditCard = creditCard;
    }
}







