package org.cquinto;

import org.cquinto.domain.acquisitions.*;
import org.cquinto.domain.products.*;
import org.cquinto.domain.services.*;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Cristian Ezequiel Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        Product[] products = new Product[6];

        products[0] = new Accessory("Charger", "Generic", 10_000.0);
        products[2] = new Accessory("Keyboard", "Logitech", 15_000.0);
        products[1] = new Accessory("Headphones", "Sennheiser", 40_000.0);

        products[3] = new FinalProduct("Tablets", "Samsung", 150_500.0);
        products[4] = new FinalProduct("Smart TV", "Philips", 300_000.0);
        products[5] = new FinalProduct("Smart Phone", "Huawei", 100_000.0);

        Service[] services = new Service[6];

        services[0] = new Repair("Flashing", "JL Solution", 8_000.0);
        services[1] = new Repair("Parts Replacement", "PC Fixer", 9_000.0);
        services[2] = new Repair("Hardware Updating", "RAM Technology", 12_000.0);

        services[3] = new Maintenance("Updates", "US Data Bank", 7_000.0);
        services[4] = new Maintenance("Cleaning", "Software Factory", 5_000.0);
        services[5] = new Maintenance("Formatting", "Techno Bytes Store", 10_000.0);

        Acquisition[] acquisitions = new Acquisition[]{};

        Store store = new Store(products, services, acquisitions);

        int mainOption;
        int detailOption;
        int yesOrNoOption;

        String clientName;
        String clientPhone;
        String observations;

        do {
            LocalDate currentDate = LocalDate.now();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome! What dou you want?");
            System.out.println("1. Product");
            System.out.println("2. Service");
            System.out.println("3. List today's product acquisitions");
            System.out.println("4. List today's service acquisitions");

            System.out.print("Enter an option (quit with 0): ");
            mainOption = Integer.parseInt(scanner.nextLine());

            switch (mainOption) {
                case 1:
                    store.listProducts();

                    System.out.print("Select product: ");
                    detailOption = Integer.parseInt(scanner.nextLine());

                    ProductDetail productDetail = store.getProductDetail(detailOption);
                    System.out.println(productDetail);

                    System.out.print("What would you like to do? (1. Acquire, 2. Cancel): ");
                    yesOrNoOption = Integer.parseInt(scanner.nextLine());

                    if (yesOrNoOption == 1) {
                        System.out.print("Enter client name: ");
                        clientName = scanner.nextLine();

                        System.out.print("Enter client phone: ");
                        clientPhone = scanner.nextLine();

                        System.out.print("Enter observations: ");
                        observations = scanner.nextLine();

                        store.registerAcquisition(
                                new ProductAcquisition(
                                        clientName, clientPhone, observations, currentDate, detailOption, productDetail.getBrand()));

                        System.out.println("Product acquired successfully!");
                    }
                    break;
                case 2:
                    store.listServices();

                    System.out.print("Select service: ");
                    detailOption = Integer.parseInt(scanner.nextLine());

                    ServiceDetail serviceDetail = store.getServiceDetail(detailOption);
                    System.out.println(serviceDetail);

                    System.out.print("What would you like to do? (1. Acquire, 2. Cancel): ");
                    yesOrNoOption = Integer.parseInt(scanner.nextLine());

                    if (yesOrNoOption == 1) {
                        System.out.print("Enter client name: ");
                        clientName = scanner.nextLine();

                        System.out.print("Enter client phone: ");
                        clientPhone = scanner.nextLine();

                        System.out.print("Enter observations: ");
                        observations = scanner.nextLine();

                        store.registerAcquisition(
                                new ServiceAcquisition(
                                        clientName, clientPhone, observations, currentDate, detailOption, serviceDetail.getCompany()));

                        System.out.println("Service acquired successfully!");
                    }
                    break;
                case 3:
                    store.listProductAcquisitions(currentDate);
                    break;
                case 4:
                    store.listServiceAcquisitions(currentDate);
                    break;
                case 0:
                    System.out.println("Bye! See you soon.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        } while (mainOption != 0);
    }

}
