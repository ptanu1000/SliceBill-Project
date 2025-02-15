import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input customer details
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.println("Enter delivery address: ");
        String address = scanner.nextLine();

        // Create customer object
        Customer customer = new Customer(name, address);

        // Choose pizza size and crust type
        System.out.println("\nChoose pizza size (small, medium, large): ");
        String size = scanner.nextLine();
        System.out.println("Choose crust type (Thin, Thick, Stuffed): ");
        String crustType = scanner.nextLine();

        // Create pizza object
        Pizza pizza = new Pizza(size, crustType);

        // Add toppings
        System.out.println("Enter number of toppings you want to add: ");
        int numToppings = scanner.nextInt();
        double toppingPrice = 0.0;
        for (int i = 1; i <= numToppings; i++) {
            System.out.println("Enter price for topping " + i + ": ");
            toppingPrice += scanner.nextDouble();
        }
        pizza.addToppings(toppingPrice);

        // Create order object
        PizzaOrder order = new PizzaOrder(pizza, customer);

        // Apply discount
        System.out.println("\nDo you want to apply a discount? (yes/no): ");
        String applyDiscount = scanner.next();
        if (applyDiscount.equalsIgnoreCase("yes")) {
            System.out.println("Enter discount percentage: ");
            double discountPercentage = scanner.nextDouble();
            double finalPrice = order.applyDiscount(discountPercentage);
            System.out.println("Total after discount: " + finalPrice);
        }

        // Generate and display bill
        order.generateBill();

        scanner.close();
    }
}
