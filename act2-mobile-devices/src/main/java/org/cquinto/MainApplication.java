package org.cquinto;

import org.cquinto.domain.*;

import java.util.Scanner;

/**
 * Cristian Ezequiel Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        Product[] products = new Product[6];

        products[0] = new Accessory("Charger", 10_000.0);
        products[2] = new Accessory("Keyboard", 15_000.0);
        products[1] = new Accessory("Headphones", 40_000.0);

        products[3] = new FinalProduct("Tablets", 150_500.0);
        products[4] = new FinalProduct("Smart TV", 300_000.0);
        products[5] = new FinalProduct("Smart Phone", 100_000.0);

        Service[] services = new Service[6];

        services[0] = new Repair("Flashing", 8_000.0);
        services[1] = new Repair("Parts Replacement", 9_000.0);
        services[2] = new Repair("Hardware Updating", 12_000.0);

        services[3] = new Maintenance("Updates", 7_000.0);
        services[4] = new Maintenance("Cleaning", 5_000.0);
        services[5] = new Maintenance("Formatting", 10_000.0);

        Acquisition[] acquisitions = new Acquisition[]{};

        Store store = new Store(products, services, acquisitions);

        int option;

        do {
            System.out.println("1. Buy product");
            System.out.println("2. Buy service");

            System.out.println("3. List product acquisitions");
            System.out.println("4. List service acquisitions");

            System.out.print("Enter an option (quit with 0): ");

            Scanner scanner = new Scanner(System.in);

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    store.listProducts();
                    break;
                case 2:
                    store.listServices();
                    break;
                case 3:
                    store.listProductAcquisitions();
                    break;
                case 4:
                    store.listServiceAcquisitions();
                    break;
                case 0:
                    System.out.println("Bye! See you soon.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        } while (option != 0);
    }

}
