public interface IceCreamFactory {
    IceCream createIceCream(String flavor, int scoops);
    Topping createTopping(String toppingType, int quantity);
    Container createContainer(String containerType);    
} 
