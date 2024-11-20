public abstract class IceCream implements IceCreamComponent{
    protected String flavor;
    protected double pricePerScoop;
    protected int scoops;

    public IceCream(String flavor, double pricePerScoop, int scoops) {
        this.flavor = flavor;
        this.pricePerScoop = pricePerScoop;
        this.scoops = scoops;
    }

    @Override
    public double getPrice() {
        return pricePerScoop * scoops;
    }

    @Override
    public String getDescription() {
        return String.format("%s - %d scoop(s)", flavor, scoops);
    }
}
