package org.launchcode.java.exercises.ch7technologyinheritance.Main;

public class Computer {
    private int memoryGB;
    private int storageGB;
    private double[] screenSize;
    private boolean powerOn;

    public Computer(int memoryGB, int storageGB, double[] screenSize) {
        this.memoryGB = memoryGB;
        this.storageGB = storageGB;
        this.screenSize = screenSize;
        this.powerOn = false;
    }

    public int getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(int memoryGB) {
        this.memoryGB = memoryGB;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public double[] getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double[] screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    // instance methods
    public void togglePower() {
        if (this.powerOn) {
            this.powerOn = false;
        } else {this.powerOn = true;}
    }

}
