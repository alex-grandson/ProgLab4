package ru.itmo.Location;

import ru.itmo.Humans.Human;

public class Place {
    private String name;

    public Place(String name) {
        this.name = name;
        System.out.println("Place " + name + " successfully created.");
    }

    public String getName() {
        return name;
    }
    public void addCreature(Human human) {
        System.out.println("To " + name + " successfully added " + human.getName() + ".");
    }

}
