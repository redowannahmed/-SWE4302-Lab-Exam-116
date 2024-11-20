public abstract class Topping implements IceCreamComponent
{
    protected String name;
    protected double price;
    protected int quantity;

    public Topping(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return price * quantity;
    }

    @Override
    public String getDescription() {
        return String.format("%s - %d time(s)", name, quantity);
    }
}