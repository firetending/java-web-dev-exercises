package org.launchcode.java.exercises;

import java.util.Scanner;

public class FuelEconomy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        float miles = input.nextFloat();
        System.out.println("How much gas have you consumed? (gallons)");
        float gallonsOfGas = input.nextFloat();
        input.close();
        System.out.println("Fuel Economy (MPG): "+miles/gallonsOfGas);
    }
}
