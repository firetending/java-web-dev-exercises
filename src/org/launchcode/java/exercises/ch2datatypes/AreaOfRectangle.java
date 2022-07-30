package org.launchcode.java.exercises.ch2datatypes;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What are the rectangle's dimensions?");
        System.out.println("length (in):");
        float length = input.nextFloat();
        System.out.println("width (in):");
        float width  = input.nextFloat();
        input.close();
        float area = length * width;
        System.out.println("rectangle area (in^2): "+area);
    }
}
