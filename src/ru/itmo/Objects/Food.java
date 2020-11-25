package ru.itmo.Objects;

public enum Food {
    VARENIE("varenie"),
    PLYUSHKI("plyushki"),
    MILK("milk");

    private final String food;
    Food(String food) {
        this.food = food;
    }
    @Override
    public String toString() {
        return name();
    }
}
