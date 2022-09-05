package org.launchcode.java.exercises.ch7technologyinheritance.Main;

public class Laptop extends Computer{
    private boolean lidOpen;

    public Laptop() {
        this(8,16,new double[]{1,1});
    }

    public Laptop(int memoryGB, int storageGB, double[] screenSize) {
        super(memoryGB,storageGB,screenSize);
        this.lidOpen = false;
    }

    public boolean isLidOpen() {
        return lidOpen;
    }

    public void openLid() {
        this.lidOpen = true;
    }

    public void closeLid() {
        this.lidOpen = false;
        //if power is on, toggle off
        if (this.isPowerOn()) {
            this.togglePower();
        }
    }
}
