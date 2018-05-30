package com.example.user.birdapp;

import java.util.ArrayList;

public class TopBirds {

    private ArrayList<Bird> list;

    public TopBirds(){
        list = new ArrayList<Bird>();
        list.add(new Bird(1,"Kingfisher", "Kingfishers"));
        list.add(new Bird(2,"White Tailed Eagle", "Eagles"));
        list.add(new Bird(3,"Barn Owl", "Owls"));
        list.add(new Bird(4,"Goldfinch", "Finches"));
        list.add(new Bird(5,"Kestrel", "Falcon"));
    }

    public ArrayList<Bird> getList(){
        return new ArrayList<Bird>(list);
    }
}
