package org.cquinto;

import org.cquinto.domain.Acquisition;
import org.cquinto.domain.Product;
import org.cquinto.domain.Service;

import java.util.Arrays;

public final class Store {
    private final Product[] products;
    private final Service[] services;
    private Acquisition[] acquisitions;

    public Store(Product[] products, Service[] services, Acquisition[] acquisitions) {
        this.products = products;
        this.services = services;
        this.acquisitions = acquisitions;
    }

    public void registerAcquisition(Acquisition acquisition) {
        int acquisitionsLenght = acquisitions.length;

        acquisitions = Arrays.copyOf(acquisitions, acquisitionsLenght + 1);

        acquisitions[acquisitionsLenght] = acquisition;
    }

    public Product[] getProducts() {
        return products;
    }

    public Service[] getServices() {
        return services;
    }

    public Acquisition[] getAcquisitions() {
        return acquisitions;
    }

}
