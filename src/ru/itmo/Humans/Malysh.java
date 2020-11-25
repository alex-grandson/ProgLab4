package ru.itmo.Humans;

import ru.itmo.Objects.Album;
import ru.itmo.Objects.Organs;
import ru.itmo.Objects.Stump;

import java.util.ArrayList;

public class Malysh extends Human implements IActions {

    private String name;
    private boolean needHelp;

    public Malysh() {
        System.out.println("Unknown malysh successfully created");
    }
    public Malysh(String name) {
        super(name);
    }

    public Malysh(String name, ArrayList<Organs> organs) {
        super(name, organs);
    }

    boolean isNeedHelp() {
        return needHelp;
    }
    void needHelp() {
        needHelp = true;
    }
    public void dontNeedHelp() {
        needHelp = false;
    }

    @Override
    public String otorvatsa() {
        return null;
    }

    @Override
    public String kley() {
        return null;
    }

    @Override
    public void lubovatsa(Stump stump) {
        System.out.println("oh kakaya awesome marka. This is " + stump.getName());
    }
    @Override
    public void pasteStump(Album album, Stump stump) {
        System.out.println("Stump " + stump.getName() + " of beauty " + stump.getBeauty() + " was pasted into " + album.getOwner() + "'s album.");
    }
    @Override
    public void otlozhit(Album album) {
        System.out.println("Otlozhil album");
    }

    @Override
    public String toBe() {
        return null;
    }
}
