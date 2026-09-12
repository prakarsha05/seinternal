package kmitlab2.OBS;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       ONLINE BOUTIQUE STORE");
        System.out.println("======================================");

        System.out.println("\n1. View Products");
        System.out.println("2. Buy Product");
        System.out.println("3. View Cart");
        System.out.println("4. Exit");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();
        System.out.println("Product.java nd order.java");
        switch (choice) {

            case 1:
                System.out.println("\nAvailable Products");
                System.out.println("--------------------------");
                System.out.println("1. T-Shirt       - Rs. 799");
                System.out.println("2. Jeans         - Rs. 1499");
                System.out.println("3. Shoes         - Rs. 1999");
                System.out.println("4. Handbag       - Rs. 1299");
                break;

            case 2:
                System.out.println("\nProduct List");
                System.out.println("--------------------------");
                System.out.println("1. T-Shirt       - Rs. 799");
                System.out.println("2. Jeans         - Rs. 1499");
                System.out.println("3. Shoes         - Rs. 1999");
                System.out.println("4. Handbag       - Rs. 1299");

                System.out.print("\nSelect product: ");
                int product = sc.nextInt();

                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                int price = 0;
                String productName = "";

                switch (product) {

                    case 1:
                        productName = "T-Shirt";
                        price = 799;
                        break;

                    case 2:
                        productName = "Jeans";
                        price = 1499;
                        break;

                    case 3:
                        productName = "Shoes";
                        price = 1999;
                        break;

                    case 4:
                        productName = "Handbag";
                        price = 1299;
                        break;

                    default:
                        System.out.println("Invalid product selection.");
                        sc.close();
                        return;
                }

                int total = price * quantity;

                System.out.println("\n========== ORDER DETAILS ==========");
                System.out.println("Product  : " + productName);
                System.out.println("Quantity : " + quantity);
                System.out.println("Price    : Rs. " + price);
                System.out.println("Total    : Rs. " + total);
                System.out.println("===================================");
                System.out.println("Order placed successfully!");

                break;

            case 3:
                System.out.println("\nYour Cart");
                System.out.println("--------------------------");
                System.out.println("Cart is currently empty.");
                break;

            case 4:
                System.out.println("\nThank you for visiting Online Boutique Store!");
                break;

            default:
                System.out.println("\nInvalid choice!");
        }

        sc.close();
    }
}

