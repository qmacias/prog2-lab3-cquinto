package org.cquinto.domain.services;

public abstract class Service {
    protected final String name;
    protected final ServiceDetail detail;

    protected Service(String name, String company, double price) {
        this.name = name;
        this.detail = new ServiceDetail(company, price);
    }

    public abstract String getCategory();

    public String getName() {
        return name;
    }

    public ServiceDetail getDetail() {
        return detail;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }

}
