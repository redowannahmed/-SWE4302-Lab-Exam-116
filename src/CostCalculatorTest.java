import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CostCalculatorTest {
    @Test
    public void testCalculateCosts() {
        IceCreamShopFactory factory = IceCreamShopFactory.getInstance();
        Order order = new Order(factory);
        order.addIceCream("mint chocolate chip", 2);
        order.addIceCream("chocolate fudge", 1);
        order.addTopping("sprinkles", 3);
        CostCalculator calculator = new CostCalculator();
        double subtotal = calculator.calculateSubtotal(order.getItems());
        double tax = calculator.calculateTax(subtotal);
        double total = calculator.calculateTotal(subtotal);
        assertEquals(11.90, subtotal, 0.01);
        assertEquals(0.952, tax, 0.01);
        assertEquals(12.852, total, 0.01);
    }
}
