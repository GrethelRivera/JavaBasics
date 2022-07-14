package com.rivera.objectfactory.countryfactory;

public class Country {
//Fields: name (String),
//        int  (population),
//        capital (String)

    private String name;
    private int population;
    private String capital;

    // build constructor
    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }
    // getters and setters


    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String capital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    // toString()


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append("name='").append(name).append('\'');
        sb.append(", capital='").append(capital).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
