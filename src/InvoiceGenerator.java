import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class InvoiceGenerator {
    private final FileWriter fileWriter;
    private final CostCalculator costCalculator;

    public InvoiceGenerator(FileWriter fileWriter, CostCalculator costCalculator) {
        this.fileWriter = fileWriter;
        this.costCalculator = costCalculator;
    }

    public void generateInvoice(Order order, String filePath) throws IOException {
        

        // couldn't think of implementation because of time crunch

        List<String> lines = new ArrayList<>();

        double subtotal = costCalculator.calculateSubtotal(order.getItems());
        double tax = costCalculator.calculateTax(subtotal);
        double total = costCalculator.calculateTotal(subtotal);
    
        lines.add(String.format("Subtotal: $%.2f", subtotal));
        lines.add(String.format("Tax: $%.2f", tax));
        lines.add(String.format("Total Amount Due: $%.2f", total));
        
        fileWriter.write(filePath, lines);
    }
}
