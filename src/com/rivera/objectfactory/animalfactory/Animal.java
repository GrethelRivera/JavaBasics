package com.rivera.objectfactory.animalfactory;

public class Animal {

    //    Fields: species (String), legs (short), isTerrestrial (boolean)

    private String species;
    private short legs;
    private boolean isTerrestrial;

    //generate constructors / getters/ setters / to string

    public Animal(String species, short legs, boolean isTerrestrial) {
        this.species = species;
        this.legs = legs;
        this.isTerrestrial = isTerrestrial;
    }

    public String species() {
        return species;
    }

    public short legs() {
        return legs;
    }

    public boolean isTerrestrial() {
        return isTerrestrial;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", legs=" + legs +
                ", isTerrestrial=" + isTerrestrial +
                '}';
    }
}
