public class IceCreamShopFactory implements IceCreamFactory {
    private static IceCreamShopFactory instance;

    private IceCreamShopFactory() {}

    public static IceCreamShopFactory getInstance() {
        if (instance == null) {
            instance = new IceCreamShopFactory();
        }
        return instance;
    }

    @Override
    public IceCream createIceCream(String flavor, int scoops) {
        return switch (flavor.toLowerCase()) {
            case "mint chocolate chip" -> new MintChocolateChip(scoops);
            case "chocolate fudge" -> new ChocolateFudge(scoops);
            case "strawberry swirl" -> new StrawberrySwirl(scoops);
            case "pistachio delight" -> new PistachioDelight(scoops);
            default -> throw new IllegalArgumentException("Invalid flavor: " + flavor);
        };
    }

    @Override
    public Topping createTopping(String toppingType, int quantity) {
        return switch (toppingType.toLowerCase()) {
            case "sprinkles" -> new Sprinkles(quantity);
            case "marshmallow" -> new Marshmallow(quantity);
            case "crushed oreo" -> new CrushedOreo(quantity);
            case "fresh strawberries" -> new FreshStrawberries(quantity);
            case "chocolate chips" -> new ChocolateChips(quantity);
            default -> throw new IllegalArgumentException("Invalid topping: " + toppingType);
        };
    }

    @Override
    public Container createContainer(String containerType) {
        return switch (containerType.toLowerCase()) {
            case "paper cup" -> new PaperCup();
            case "waffle cone" -> new WaffleCone();
            default -> throw new IllegalArgumentException("Invalid container: " + containerType);
        };
    }
}
