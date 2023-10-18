package com.example.example;

public class Country {
    private String countryName;
    private String countryFlag;
    private int population;
    //constructor
    public Country(String countryName, String countryFlag, int population) {
        this.countryName = countryName;
        this.countryFlag = countryFlag;
        this.population = population;
    }
    //getters
    public String getCountryName() {
        return countryName;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public int getPopulation() {
        return population;
    }


    //setters
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
