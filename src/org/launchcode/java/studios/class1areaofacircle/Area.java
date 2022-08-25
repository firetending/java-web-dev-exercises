package org.launchcode.java.studios.class1areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle? (cm)");
        Double radius = null;
        while (radius == null || radius < 0) {
            try {
                radius = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Your input was invalid! Bugger off!");
                return;
            }
            if (radius < 0) {
                System.out.println("Your input was negative! Try again :)");
            }
        }
        input.close();
        Double area = Circle.getArea(radius);
        System.out.println("Area of the circle (cm^2): "+area);
    }
}
