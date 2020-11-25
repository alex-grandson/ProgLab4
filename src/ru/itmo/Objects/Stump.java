package ru.itmo.Objects;

public class Stump {
    private String name;
    private int beauty;
    private String country;
    private int price;

    public Stump(String name, int beauty, String country, int price) {
        this.name = name;
        this.beauty = beauty;
        this.country = country;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeauty() {
        return beauty;
    }

    public void setBeauty(int beauty) {
        this.beauty = beauty;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
