package org.launchcode.java.exercises.ch7technologyinheritance.Test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.exercises.ch7technologyinheritance.Main.SmartPhone;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SmartPhoneTest {

    SmartPhone testPhone;
    int memory = 8;
    int storage = 250;
    double[] screen = {2.7,6.4};
    double[] startLoc = {40.486511,-86.131241}; //Kokomo, IN
    double[] loc2 = {39.838710,-91.739110}; //Phila, MO
    double[] loc3 = {51.178883,-1.826215}; //Stonehenge
    @Before
    public void createPhone() {
        testPhone = new SmartPhone(memory,storage,screen);
    }

    @Test
    public void callsParentConstructor() {
        assertEquals(storage,testPhone.getStorageGB(),.001);
    }

    @Test
    public void powerStartsOff() {
        assertFalse(testPhone.isPowerOn());
    }

    @Test
    public void implementsLocationLog() {
        ArrayList<double[]> expectedLog = new ArrayList<>();

        //check that loc was initialized
        expectedLog.add(startLoc);
        assertTrue(Arrays.equals(startLoc,testPhone.getLocationGPS()));

        //check that log was initialized
        assertTrue(Arrays.deepEquals(expectedLog.toArray(),testPhone.getLocationLog().toArray()));

        //check setting new loc adds it to log
        expectedLog.add(loc2); //add new loc to expected log
        testPhone.setLocationGPS(loc2); //sets new loc, which should update log
        assertTrue(Arrays.deepEquals(expectedLog.toArray(),testPhone.getLocationLog().toArray())); //check for new loc in log

        //check setting same loc makes no new log entry
        testPhone.setLocationGPS(loc2); //set to same loc, no new log entry
        assertTrue(Arrays.deepEquals(expectedLog.toArray(),testPhone.getLocationLog().toArray())); //check for same expected log

        //check setting new loc again makes new log entry
        testPhone.setLocationGPS(loc3); //sets new loc which should update log
        expectedLog.add(loc3); //add new loc to expected log
        assertTrue(Arrays.deepEquals(expectedLog.toArray(),testPhone.getLocationLog().toArray())); //check for new loc in log

//        //print log just because;
//        testPhone.printLocationLog();
    }
}