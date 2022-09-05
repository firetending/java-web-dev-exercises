package org.launchcode.java.exercises.ch7technologyinheritance.Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.launchcode.java.exercises.ch7technologyinheritance.Main.Computer;

public class ComputerTest {
    Computer testComp;
    int memory = 24;
    int storage = 1024;
    double[] screen = {25,14};
    @Before
    public void createComp() {
        testComp = new Computer(memory,storage,screen);
    }

    @Test
    public void argFieldsInitialized() {
        assertEquals(storage,testComp.getStorageGB(),.001);
    }

    @Test
    public void powerStartsOff() {
        assertEquals(false,testComp.isPowerOn());
    }

    @Test
    public void powerToggles() {
        assertEquals(false,testComp.isPowerOn());
        testComp.togglePower();
        assertEquals(true,testComp.isPowerOn());
    }
}
