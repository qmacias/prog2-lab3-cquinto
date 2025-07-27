package org.cquinto.domain;

import java.time.LocalDate;

public final class ProductAcquisition extends Acquisition {
    private final Product product;

    public ProductAcquisition(String clientName, String clientPhone, String observations, LocalDate currentDate, Product product) {
        super(clientName, clientPhone, observations, currentDate);
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String getType() {
        return "Product";
    }

}
