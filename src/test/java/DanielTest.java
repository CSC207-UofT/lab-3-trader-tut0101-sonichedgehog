import org.junit.*;

import static org.junit.Assert.*;


public class DanielTest {
    Daniel d;

    @Before
    public void setUp() throws Exception {
        d = new Daniel();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Yeehaw!", d.sound());
    }

    @Test(timeout = 50)
    public void TestIncreaseSleekness() {
        d.increaseSleekness();
        d.increaseSleekness();
        assertEquals(120, d.getsleekness());
    }

    @Test(timeout = 50)
    public void TestDecreaseSleekness() {
        d.decreaseSleekness();
        assertEquals(0, d.getsleekness());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(999, d.getPrice());
    }
}