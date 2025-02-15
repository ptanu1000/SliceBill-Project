public class PizzaOrder {
    private Pizza pizza;
    private Customer customer;

    // Constructor
    public PizzaOrder(Pizza pizza, Customer customer) {
        this.pizza = pizza;
        this.customer = customer;
    }

    // Method to apply a discount if needed
    public double applyDiscount(double discountPercentage) {
        double totalPrice = pizza.calculateTotalPrice();
        return totalPrice - (totalPrice * discountPercentage / 100);
    }

    // Method to generate the bill
    public void generateBill() {
        System.out.println("\n--- SliceBill Order Summary ---");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Pizza Size: " + pizza.getSize());
        System.out.println("Crust Type: " + pizza.getCrustType());
        System.out.println("Base Price: $" + pizza.getBasePrice());
        System.out.println("Toppings Price: $" + pizza.getToppingsPrice());
        System.out.println("Total Price: $" + pizza.calculateTotalPrice());
    }
}
