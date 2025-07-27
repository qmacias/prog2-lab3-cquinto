package org.cquinto;

import org.cquinto.domain.*;

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

    public void listProducts() {
        System.out.println("Products:");

        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d.- %s\n", i + 1, products[i].toString());
        }
    }

    public void listServices() {
        System.out.println("Services:");

        for (int i = 0; i < services.length; i++) {
            System.out.printf("%d.- %s\n", i + 1, services[i].toString());
        }
    }

    public void listProductAcquisitions() {
        System.out.println("Product acquisitions:");

        for (int i = 0; i < acquisitions.length; i++) {
            if (acquisitions[i].getType().equals("Product")) {
                ProductAcquisition productAcquisition = (ProductAcquisition) acquisitions[i];

                System.out.println(productAcquisition.toString());
            }
        }
    }

    public void listServiceAcquisitions() {
        System.out.println("Service acquisitions:");

        for (int i = 0; i < acquisitions.length; i++) {
            if (acquisitions[i].getType().equals("Service")) {
                ServiceAcquisition serviceAcquisition = (ServiceAcquisition) acquisitions[i];

                System.out.println(serviceAcquisition.toString());
            }
        }
    }

}
