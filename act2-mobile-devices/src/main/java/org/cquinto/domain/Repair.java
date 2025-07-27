package org.cquinto.domain;

public final class Repair extends Service {
    public Repair(String name, String company, double price) {
        super(name, company, price);
    }

    @Override
    public String getCategory() {
        return "Repair";
    }

}
