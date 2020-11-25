package ru.itmo.Humans;

public class Mom extends Human implements IMomActions {
    public Mom() {
    }

    @Override
    public void frightened(Malysh malysh) {
        System.out.println(super.getName() + " ispugatsa");
        callFireFighters(malysh);
    }

    public Mom(String name) {
        super(name);
    }

    @Override
    public void callFireFighters(Malysh malysh) {
        System.out.println("FireFighter successfully called.");
        FireFighter.saveMalysh(malysh);
    }

}
