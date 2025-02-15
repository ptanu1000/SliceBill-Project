public class Pizza {
    private String size;
    private String crustType;
    private double basePrice;
    private double toppingsPrice;

    // Constructor
    public Pizza(String size, String crustType) {
        this.size = size;
        this.crustType = crustType;
        this.basePrice = calculateBasePrice(size);
        this.toppingsPrice = 0.0;  // Start with no toppings
    }

    // Method to calculate base price based on size
    private double calculateBasePrice(String size) {
        switch (size.toLowerCase()) {
            case "small": return 5.0;
            case "medium": return 8.0;
            case "large": return 10.0;
            default: return 0.0;
        }
    }

    // Method to add toppings
    public void addToppings(double toppingsPrice) {
        this.toppingsPrice += toppingsPrice;
    }

    // Method to calculate total price
    public double calculateTotalPrice() {
        return basePrice + toppingsPrice;
    }

    // Getters
    public String getSize() { return size; }
    public String getCrustType() { return crustType; }
    public double getBasePrice() { return basePrice; }
    public double getToppingsPrice() { return toppingsPrice; }
}

