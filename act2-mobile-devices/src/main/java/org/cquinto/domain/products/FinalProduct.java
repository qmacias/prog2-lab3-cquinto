package org.cquinto.domain.products;

public final class FinalProduct extends Product {
    public FinalProduct(String name, String brand, double price) {
        super(name, brand, price);
    }

    @Override
    public String getType() {
        return "Final product";
    }

}
