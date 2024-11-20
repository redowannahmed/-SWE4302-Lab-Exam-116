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

        assertEquals(9.50, subtotal, 0.01);   
        assertEquals(0.76, tax, 0.01);       
        assertEquals(10.26, total, 0.01);
    }

    @Test
    void testMultipleScoopsAndToppingsWithWaffleCone() {
        IceCreamShopFactory factory = IceCreamShopFactory.getInstance();
        Order order = new Order(factory);
        order.addIceCream("Mint Chocolate Chip", 2);  
        order.addIceCream("Pistachio Delight", 1);   
        order.addTopping("Fresh Strawberries", 2);   
        order.addTopping("Chocolate Chips", 1);      
        order.setContainer("Waffle Cone"); 

        CostCalculator calculator = new CostCalculator();
        

        double total = calculator.calculateSubtotal(order.getItems());

       
        double expectedTotal = 16.35;

        assertEquals(expectedTotal, total, 0.01, 
            "Total should be subtotal + tax for multiple items");
    }
}
