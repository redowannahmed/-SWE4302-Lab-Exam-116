import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Step 1: Get the factory instance
        IceCreamShopFactory factory = IceCreamShopFactory.getInstance();

        // Step 2: Create an order
        Order order = new Order(factory);

        // Add ice creams
        order.addIceCream("mint chocolate chip", 2);  // 2 scoops of Mint Chocolate Chip
        order.addIceCream("chocolate fudge", 1);       // 1 scoop of Chocolate Fudge

        // Add toppings
        order.addTopping("sprinkles", 3);              // 3 sprinkles
        order.addTopping("chocolate chips", 2);        // 2 chocolate chips

        // Set container
        order.setContainer("waffle cone");

        // Step 3: Calculate costs
        CostCalculator costCalculator = new CostCalculator();

        // Calculate subtotal, tax, and total
        double subtotal = costCalculator.calculateSubtotal(order.getItems());
        double tax = costCalculator.calculateTax(subtotal);
        double total = costCalculator.calculateTotal(subtotal);

        System.out.println("Order Summary:");
        order.getItems().forEach(item -> 
            System.out.printf("%s: $%.2f%n", item.getDescription(), item.getPrice())
        );
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f%n", total);
    }
}
