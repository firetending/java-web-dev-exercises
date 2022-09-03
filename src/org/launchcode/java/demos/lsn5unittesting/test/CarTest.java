package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.java.demos.lsn5unittesting.main.Car;

import java.util.Objects;

import static org.junit.Assert.*;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    Car test_car;
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota","Prius",10, 50);
    }
    @Test
    public void testInitialGasTank() {
        assertEquals(10,test_car.getGasTankLevel(),.001);
//        double gas = test_car.getGasTankLevel(); //for alternates
//        assertFalse(gas<10 || gas>10); //alternate1
//        assertTrue(gas==10); //alternate2
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9,test_car.getGasTankLevel(),.001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        double maxRange = test_car.getMilesPerGallon()* test_car.getGasTankSize();
        test_car.drive(maxRange+10);
        assertEquals(0,test_car.getGasTankLevel(),.001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }
}
