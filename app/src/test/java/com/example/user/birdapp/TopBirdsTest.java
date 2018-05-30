package com.example.user.birdapp;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TopBirdsTest {

    @Test
    public void getListTest(){
        TopBirds topBirds = new TopBirds();
        assertEquals(5, topBirds.getList().size());
    }
}
