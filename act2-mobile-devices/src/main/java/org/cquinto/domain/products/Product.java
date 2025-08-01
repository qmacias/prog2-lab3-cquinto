package org.cquinto.domain.products;

public abstract class Product {
    protected final String name;
    protected final ProductDetail detail;

    public Product(String name, String brand, double price) {
        this.name = name;
        this.detail = new ProductDetail(brand, price);
    }

    public ProductDetail getDetail() {
        return detail;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }

}
