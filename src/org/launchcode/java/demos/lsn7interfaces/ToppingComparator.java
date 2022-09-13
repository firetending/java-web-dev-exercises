package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping> {
    @Override
    public int compare(Topping o1, Topping o2) {
        double cost1 = o1.getCost();
        double cost2 = o2.getCost();
        if (cost1 == cost2) {
            return 0;
        } else if (cost1 > cost2) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public Comparator<Topping> reversed() {
        return Comparator.super.reversed();
    }
}
