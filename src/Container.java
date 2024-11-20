public abstract class Container implements IceCreamComponent {
    protected String type;
    protected double price;

    public Container(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return type;
    }
}
