package ru.itmo.Humans;

import ru.itmo.Objects.Food;
import ru.itmo.Objects.Organs;

import java.util.ArrayList;

public class Karlson extends Human implements IKarlsonActions {
    @Override
    public void poshalitb(Malysh malysh) {
        System.out.println("Successfully poshalili with the " + malysh.getName());

    }

    @Override
    public void flyAway() {
        System.out.println("He's literally flew away, but ");
        promiseToReturn();
    }

    @Override
    public void promiseToReturn() {
        System.out.println("he promised to return.");
    }

    @Override
    public void showRodnoyHouse(Malysh malysh) {
        System.out.println("Look " + malysh.getName() + " how big is my house on the roof.");
    }

    @Override
    public void balovatsa(Food food) {
        System.out.println("A my tut balovatsa with " + food.name());
    }

    public Karlson() {
        System.out.println("Unknown Karlson successfully created");
    }

    public Karlson(String name) {
        super(name);

    }

    public Karlson(String name, ArrayList<Organs> organs) {
        super(name, organs);
    }
}
