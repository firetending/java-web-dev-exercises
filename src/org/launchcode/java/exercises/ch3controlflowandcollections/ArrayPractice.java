package org.launchcode.java.exercises.ch3controlflowandcollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //INTS
        int[] nums = {1, 1, 2, 3, 5, 8};

        //print all
        System.out.println("all");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //print odds
        System.out.println("odds");
        for (int i = 0; i < nums.length; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }

        //STRINGS
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a " +
                "house. I will not eat them with a mouse.";

        //split to words
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        //split to sentences
        String[] sentences = str.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
