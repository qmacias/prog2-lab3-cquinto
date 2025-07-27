package org.cquinto.domain;

public final class ProductDetail {
    private final String brand;
    private final double price;

    public ProductDetail(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s - Price: %.2f", brand, price);
    }

}
