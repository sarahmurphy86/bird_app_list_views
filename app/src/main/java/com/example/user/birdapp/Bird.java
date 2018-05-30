package com.example.user.birdapp;

public class Bird {

    private int ranking;
    private String species;
    private String family;

    public Bird(Integer ranking,String species, String family){
        this.ranking = ranking;
        this.species = species;
        this.family = family;
    }

    public int getRanking(){
        return this.ranking;
    }

    public String getSpecies() {
        return this.species;
    }

    public String getFamily() {
        return this.family;
    }
}
