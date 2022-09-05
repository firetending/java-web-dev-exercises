package org.launchcode.java.exercises.ch7technologyinheritance.Test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.launchcode.java.exercises.ch7technologyinheritance.Main.AbstractEntity;
import org.launchcode.java.exercises.ch7technologyinheritance.Main.Computer;
import org.launchcode.java.exercises.ch7technologyinheritance.Main.Laptop;
import org.launchcode.java.exercises.ch7technologyinheritance.Main.SmartPhone;

import static org.junit.Assert.*;

public class AbstractEntityTest {
    Computer testComp;
    Laptop testLaptop;
    SmartPhone testPhone;
    Computer test2;
    Computer test3;
    Computer test4;

    @Before
    public void createTestObjects() {
        testComp = new Computer();
        test2 = new Computer();
        test3 = new Laptop();
        test4 = new SmartPhone();
        testLaptop = new Laptop();
        testPhone = new SmartPhone();
    }

    @Test
    public void idIsUniqueInAllSubclasses() {
        assertNotEquals(testComp.getUniqueId(), testLaptop.getUniqueId());
        assertNotEquals(testLaptop.getUniqueId(), testPhone.getUniqueId());
        assertNotEquals(testComp.getUniqueId(), testPhone.getUniqueId());
        System.out.println(testComp.getUniqueId());
        System.out.println(testLaptop.getUniqueId());
        System.out.println(testPhone.getUniqueId());
    }
}
