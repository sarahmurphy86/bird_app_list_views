package com.example.user.birdapp;

import java.io.Serializable;

public class Bird implements Serializable {

    private Integer ranking;
    private String species;
    private String family;

    public Bird(Integer ranking,String species, String family){
        this.ranking = ranking;
        this.species = species;
        this.family = family;
    }

    public Integer getRanking(){
        return this.ranking;
    }

    public String getSpecies() {
        return this.species;
    }

    public String getFamily() {
        return this.family;
    }
}
