package org.cquinto.domain;

public final class Maintenance extends Service {
    public Maintenance(String name, double price) {
        super(name, price);
    }

    @Override
    public String getCategory() {
        return "Maintenance";
    }

}
