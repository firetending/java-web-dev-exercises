package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield",12);
        garfield.eat();
        System.out.println(garfield.isTired()); //prints true
        System.out.println(garfield.getWeight());
        System.out.println(garfield.isHungry());
        garfield.setHungry(true);
        System.out.println(garfield.isHungry());
    }


}
