package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        double cost1 = o1.getCost();
        double cost2 = o2.getCost();

        //results in ascending sort
        if (cost1 == cost2) {
            return 0;
        } else if (cost1 > cost2) {
            return 1;
        } else {
            return -1;
        }
    }
}
