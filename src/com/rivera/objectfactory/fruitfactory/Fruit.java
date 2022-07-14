package com.rivera.objectfactory.fruitfactory;

import javax.swing.*;

public class Fruit {
    // Fields: name (String), color (String), hasSeeds (boolean)
    // Set private
    // set constructors, getters, setters

    private String name;
    private String color;
    private boolean hasSeeds;

    public Fruit(String name, String color, boolean hasSeeds) {
        this.name = name;
        this.color = color;
        this.hasSeeds = hasSeeds;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean hasSeeds() {
        return hasSeeds;
    }

    public void setHasSeeds(boolean hasSeeds) {
        this.hasSeeds = hasSeeds;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("name='").append(name).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", hasSeeds=").append(hasSeeds);
        sb.append('}');
        return sb.toString();
    }
}
