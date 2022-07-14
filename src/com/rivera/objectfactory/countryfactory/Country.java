package com.rivera.objectfactory.countryfactory;

public class Country {
//Fields: name (String),
//        int  (population),
//        capital (String)

    private String name;
    private int population;
    private String capital;

    public Country(String name, int population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }

    // getters and setters

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int population() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
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
        sb.append(", population=").append(population);
        sb.append(", capital='").append(capital).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
