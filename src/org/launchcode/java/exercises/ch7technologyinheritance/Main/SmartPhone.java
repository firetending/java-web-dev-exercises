package org.launchcode.java.exercises.ch7technologyinheritance.Main;

import java.util.ArrayList;
import java.util.Arrays;

public class SmartPhone extends Computer {
    private double[] locationGPS;
    private ArrayList<double[]> locationLog = new ArrayList<>();

    public SmartPhone() {
        this(8,16,new double[]{1,1});
    }

    public SmartPhone(int memoryGB, int storageGB, double[] screenSize) {
        super(memoryGB,storageGB,screenSize);
        //location and log only set this way when initializing, otherwise use setter/addLoc
        this.locationGPS = new double[] {40.486511,-86.131241}; //Kokomo, IN
        this.locationLog.add(this.locationGPS);
    }

    public double[] getLocationGPS() {
        return locationGPS;
    }

    public void setLocationGPS(double[] locationGPS) {
        this.locationGPS = locationGPS;
        this.addLocationToLogIfNew();
    }

    public ArrayList<double[]> getLocationLog() {
        return locationLog;
    }

    private void addLocationToLogIfNew() {
        double[] lastLogLoc = this.locationLog.get(this.locationLog.size()-1);
        if (!Arrays.equals(this.locationGPS, lastLogLoc)) {
            this.locationLog.add(this.locationGPS);
        }
    }

    public void printLocationLog() {
        for (double[] loc : this.getLocationLog()) {
            System.out.println(Arrays.toString(loc));
        }
    }
}
