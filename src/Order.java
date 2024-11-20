import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<IceCreamComponent> items = new ArrayList<>();
    private final IceCreamFactory factory;
    
    public Order(IceCreamFactory factory) {
        this.factory = factory;
    }
    public void addIceCream(String flavor, int scoops) {
        items.add(factory.createIceCream(flavor, scoops));
    }
    public void addTopping(String toppingType, int quantity) {
        items.add(factory.createTopping(toppingType, quantity));
    }

    public void setContainer (String containerType)
    {
        items.add(factory.createContainer(containerType));
    }
    
    public List<IceCreamComponent> getItems() {
        return items;
    }
}
