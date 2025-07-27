package org.cquinto.domain;

public final class FinalProduct extends Product {
    public FinalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Final product";
    }

}
