package org.launchcode.java.exercises.ch7technologyinheritance.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.exercises.ch7technologyinheritance.Main.Laptop;

import static org.junit.Assert.*;

public class LaptopTest {

    Laptop testLaptop;
    int memory = 16;
    int storage = 500;
    double[] screen = {11.3,6.4};
    @Before
    public void createLaptop() {
        testLaptop = new Laptop(memory,storage,screen);
    }

    @Test
    public void callsParentConstructor() {
        assertEquals(storage,testLaptop.getStorageGB(),.001);
    }

    @Test
    public void powerStartsOff() {
        assertFalse(testLaptop.isPowerOn());
    }

    @Test
    public void implementsLid() {
        assertEquals(false,testLaptop.isLidOpen());
        testLaptop.openLid();
        assertEquals(true,testLaptop.isLidOpen());
        testLaptop.openLid(); //no change to power
        assertEquals(true,testLaptop.isLidOpen());
        testLaptop.closeLid(); //turns power off
        assertEquals(false,testLaptop.isLidOpen());
        assertEquals(false,testLaptop.isPowerOn());
    }
}
