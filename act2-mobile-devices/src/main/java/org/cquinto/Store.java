package org.cquinto;

import org.cquinto.domain.acquisitions.*;

import org.cquinto.domain.products.Product;
import org.cquinto.domain.products.ProductDetail;

import org.cquinto.domain.services.Service;
import org.cquinto.domain.services.ServiceDetail;

import java.time.LocalDate;
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
            System.out.printf("%d.- %s\n", i + 1, products[i]);
        }
    }

    public ProductDetail getProductDetail(int option) {
        return products[option - 1].getDetail();
    }

    public void listServices() {
        System.out.println("Services:");

        for (int i = 0; i < services.length; i++) {
            System.out.printf("%d.- %s\n", i + 1, services[i]);
        }
    }

    public ServiceDetail getServiceDetail(int option) {
        return services[option - 1].getDetail();
    }

    public void listProductAcquisitions(LocalDate currentDate) {
        System.out.println("History:");

        for (int i = 0; i < acquisitions.length; i++) {
            if (acquisitions[i].getType().equals("Product")) {
                ProductAcquisition productAcquisition = (ProductAcquisition) acquisitions[i];

                if (productAcquisition.getCurrentDate().isEqual(currentDate)) {
                    System.out.printf("- Product: %s, %s\n",
                            products[productAcquisition.getAcquisitionNumber()], productAcquisition);
                }
            } else {
                System.out.println("There are no product acquisitions today.");
            }
        }
    }

    public void listServiceAcquisitions(LocalDate currentDate) {
        System.out.println("History:");

        for (int i = 0; i < acquisitions.length; i++) {
            if (acquisitions[i].getType().equals("Service")) {
                ServiceAcquisition serviceAcquisition = (ServiceAcquisition) acquisitions[i];

                if (serviceAcquisition.getCurrentDate().isEqual(currentDate)) {
                    System.out.printf("- Service: %s, %s\n",
                            services[serviceAcquisition.getAcquisitionNumber()], serviceAcquisition);
                }
            } else {
                System.out.println("There are no service acquisitions today.");
            }
        }
    }

}
