import java.util.List;

public class CostCalculator {
    private static final double TAX_RATE = 0.08;

    public double calculateSubtotal(List<IceCreamComponent> items) {
        return items.stream().mapToDouble(IceCreamComponent::getPrice).sum();
    }
    
    public double calculateTax(double subtotal) {
        return subtotal * TAX_RATE;
    }

    public double calculateTotal(double subtotal) {
        return subtotal + calculateTax(subtotal);
    }
}
