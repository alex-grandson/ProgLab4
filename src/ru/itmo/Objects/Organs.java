package ru.itmo.Objects;

public class Organs {
    private String name;
    private OrganTypes type;

    public Organs(String name, OrganTypes type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Organ " + name + " of type " + type + ".";
    }

    public static enum OrganTypes {
        FACE("face"),
        EYES("eyes"),
        EARS("ears"),
        PROPELLER("propeller"),
        HEART("heart");

        private final String name;

        OrganTypes(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}

