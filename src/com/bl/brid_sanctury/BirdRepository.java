package com.bl.brid_sanctury;

import java.util.ArrayList;

public class BirdRepository {

    private ArrayList<Bird> birdList = new ArrayList<>();

    void add(Penguin penguin){
        birdList.add(penguin);
    }

    void add(Parrot parrot){
        birdList.add(parrot);
    }

    void add(Peacock peacock){
        birdList.add(peacock);
    }

    void add(Ostrich ostrich){
        birdList.add(ostrich);
    }

    void add(Duck duck){
        birdList.add(duck);
    }

    public void printBird(){
        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }

    public void getListSize(){
        System.out.println(birdList.size());
    }
}
