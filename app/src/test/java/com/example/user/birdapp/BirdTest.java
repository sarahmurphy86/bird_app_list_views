package com.example.user.birdapp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BirdTest {

    Bird bird;

    @Before
    public void before(){
        bird = new Bird(1, "Bullfinch", "Finches");
    }

    @Test
    public void canGetRanking(){
        assertEquals( (Integer)1, bird.getRanking());
    }

    @Test
    public void canGetSpecies(){
        assertEquals("Bullfinch", bird.getSpecies());
    }

    @Test
    public void canGetFamily(){
        assertEquals("Finches", bird.getFamily());
    }


}
