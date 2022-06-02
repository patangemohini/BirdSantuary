package com.bl.brid_sanctury;

import java.util.ArrayList;

public abstract class Bird {

    ArrayList<Bird> bird = new ArrayList<>();

    String name;
    String id;
    String color;
    int age;
    boolean isMammal;

    abstract void eat();

    abstract void swim();

    abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "bird=" + bird +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
