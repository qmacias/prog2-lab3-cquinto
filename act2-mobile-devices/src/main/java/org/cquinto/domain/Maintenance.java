package org.cquinto.domain;

public final class Maintenance extends Service {
    public Maintenance(String name, String company, double price) {
        super(name, company, price);
    }

    @Override
    public String getCategory() {
        return "Maintenance";
    }

}
