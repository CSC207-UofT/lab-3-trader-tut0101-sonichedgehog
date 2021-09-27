import org.junit.*;

import static org.junit.Assert.*;

public class TigerTest {
    Tiger tiger;

    @Before
    public void setUp() {
        tiger = new Tiger();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Roar!", tiger.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        int price = tiger.getPrice();
        assertEquals(100000, price);
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        tiger.upgradeSpeed();
        assertEquals(2, tiger.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        tiger.downgradeSpeed();
        assertEquals(0, tiger.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, tiger.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestToString() {
        assertEquals("The tiger has a speed of 1.", tiger.toString());
    }
}