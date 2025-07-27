package org.cquinto.domain.services;

public final class ServiceDetail {
    private final String company;
    private final double price;

    public ServiceDetail(String company, double price) {
        this.company = company;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Service detail: Company: %s - Price: %.2f", company, price);
    }

}
