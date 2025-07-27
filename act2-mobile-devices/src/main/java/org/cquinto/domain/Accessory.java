package org.cquinto.domain;

public final class Accessory extends Product {
    public Accessory(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Accessory";
    }

}
