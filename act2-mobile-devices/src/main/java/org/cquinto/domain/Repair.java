package org.cquinto.domain;

public final class Repair extends Service {
    public Repair(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Repair";
    }

}
