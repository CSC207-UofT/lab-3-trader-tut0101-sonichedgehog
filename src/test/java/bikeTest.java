import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class bikeTest {
    bike h;

    @Before
    public void setUp() throws Exception {
        h = new bike();
    }



    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(2, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(4, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(0, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50, h.getPrice());
    }

}
