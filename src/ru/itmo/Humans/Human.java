package ru.itmo.Humans;


import ru.itmo.Objects.Organs;

import java.util.ArrayList;

public class Human {
    private String name;
    private float height;
    private ArrayList<Organs> organs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public ArrayList<Organs> getOrgans() {
        return organs;
    }

    public void setOrgans(ArrayList<Organs> organs) {
        this.organs = organs;
    }

    public Human() {}

    public Human(String name) {
        System.out.println(name + " successfully created");
        this.name = name;
    }

    public Human(String name, ArrayList<Organs> organs) {
        this.name = name;
        this.organs = organs;
    }
}
