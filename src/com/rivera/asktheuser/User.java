package com.rivera.asktheuser;

public class User {
    private String name;
    private int Number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public User(String name, int number) {
        this.name = name;
        Number = number;

    }
}





