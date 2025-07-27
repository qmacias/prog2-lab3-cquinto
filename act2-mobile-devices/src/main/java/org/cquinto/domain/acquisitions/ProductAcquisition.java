package org.cquinto.domain.acquisitions;

import java.time.LocalDate;

public final class ProductAcquisition extends Acquisition {
    private final String productBrand;

    public ProductAcquisition(String clientName, String clientPhone, String observations, LocalDate currentDate, String productBrand) {
        super(clientName, clientPhone, observations, currentDate);
        this.productBrand = productBrand;
    }

    @Override
    public String getType() {
        return "Product";
    }

    @Override
    public String toString() {
        return String.format("%s, Brand: %s", super.toString(), productBrand);
    }

}
