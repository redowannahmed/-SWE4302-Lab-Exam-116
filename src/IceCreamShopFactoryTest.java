import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IceCreamShopFactoryTest {
    @Test
    public void testCreateIceCream() {
        IceCreamShopFactory factory = IceCreamShopFactory.getInstance();
        IceCream iceCream = factory.createIceCream("mint chocolate chip", 2);
        assertNotNull(iceCream);
        assertEquals("Mint Chocolate Chip - 2 scoop(s)", iceCream.getDescription());
        assertEquals(5.60, iceCream.getPrice(), 0.01);
    }
}
