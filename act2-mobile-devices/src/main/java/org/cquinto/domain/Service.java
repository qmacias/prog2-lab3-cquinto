package org.cquinto.domain;

public abstract class Service {
    protected final String name;
    protected final double price;

    protected Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getCategory();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }

}
