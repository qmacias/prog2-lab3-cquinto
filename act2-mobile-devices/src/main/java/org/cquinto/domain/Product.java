package org.cquinto.domain;

public abstract class Product {
    protected final String name;
    protected final ProductDetail detail;

    public Product(String name, String brand, double price) {
        this.name = name;
        this.detail = new ProductDetail(brand, price);
    }

    public abstract String getType();

    public String getName() {
        return name;
    }

    public ProductDetail getDetail() {
        return detail;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }

}
