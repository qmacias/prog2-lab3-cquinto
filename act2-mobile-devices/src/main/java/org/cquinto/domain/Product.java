package org.cquinto.domain;

public abstract class Product {
    protected final String name;
    protected final double price;

    protected Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getType();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product(name='%s', price='%s')", name, price);
    }

}
