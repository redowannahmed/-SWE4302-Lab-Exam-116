import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CostCalculatorTest {
    @Test
    public void testCalculateCosts() {
        IceCreamShopFactory factory = IceCreamShopFactory.getInstance();
        Order order = new Order(factory);

        // Add ice creams
        order.addIceCream("mint chocolate chip", 2); 
        order.addIceCream("chocolate fudge", 1);    

        // Add toppings
        order.addTopping("sprinkles", 3);         

        // Calculate the subtotal, tax, and total using the calculator
        CostCalculator calculator = new CostCalculator();
        double subtotal = calculator.calculateSubtotal(order.getItems());
        double tax = calculator.calculateTax(subtotal);
        double total = calculator.calculateTotal(subtotal);

        // Assertions based on correct expected values
        assertEquals(9.50, subtotal, 0.01);   // Corrected expected subtotal
        assertEquals(0.76, tax, 0.01);        // Corrected expected tax (9.50 * 0.08)
        assertEquals(10.26, total, 0.01);     // Corrected expected total (subtotal + tax)
    }
}
