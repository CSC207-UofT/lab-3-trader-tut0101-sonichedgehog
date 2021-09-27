import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class HedgehogTest {
    Hedgehog hedgehog;
    Hedgehog spikeyHedgehog;

    @Before
    public void setUp() throws Exception {
        hedgehog = new Hedgehog(2);
        spikeyHedgehog = new Hedgehog(10);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("SKREEEEE.", hedgehog.sound());
    }

    @Test(timeout = 50)
    public void TestStrokeHog() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        spikeyHedgehog.strokeHog();
        hedgehog.strokeHog();
        assertEquals("This hedgehog is too spikey!\nSKREEEEE.\n", outContent.toString());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(420, hedgehog.getPrice());
    }

}
