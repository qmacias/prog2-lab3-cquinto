package org.cquinto.domain;

public final class Accessory extends Product {
    public Accessory(String name, String brand, double price) {
        super(name, brand, price);
    }

    @Override
    public String getType() {
        return "Accessory";
    }

}
