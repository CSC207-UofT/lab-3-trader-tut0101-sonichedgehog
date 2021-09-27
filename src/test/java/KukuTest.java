/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class KukuTest {
    Kuku k;

    @Before
    public void setUp() throws Exception {
        k = new Kuku();
    }
    @Test(timeout = 50)
    public void TestgetNetWorth(){
        assertEquals(1000, k.getNetWorth());
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("kukuku!", k.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(69, k.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        k.upgradeSpeed();
        assertEquals(70, k.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        k.downgradeSpeed();
        assertEquals(68, k.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(6900, k.getPrice());
    }


}