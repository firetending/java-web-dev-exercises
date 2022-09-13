package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorAllergensComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        int count1 = o1.getAllergens().size();
        int count2 = o2.getAllergens().size();

        //results in descending sort
        if (count1 == count2) {
            return 0;
        } else if (count1 > count2) {
            return -1;
        } else {
            return 1;
        }
    }
}
