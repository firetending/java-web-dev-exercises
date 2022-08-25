package org.launchcode.java.exercises.ch3controlflowandcollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");

        //1
        ArrayList<Integer> numArr = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            numArr.add(i/3*11);
        }
        System.out.println(newLine+"#1");
        System.out.println(numArr);
        System.out.println(sumEvens(numArr));

        //2
        ArrayList<String> words = new ArrayList<>();
        words.add("fiver");
        words.add("test");
        words.add("not");
        words.add("yes!!");
        words.add("no!!");
        words.add("buddy");
        words.add("H");
        words.add("it");
        System.out.println(newLine+"#2");
        print5LetterWords(words);

        //3
        System.out.println(newLine+"#3");
        printXLetterWords(words);

        //4 bonus
        System.out.println(newLine+"#4 bonus");
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a " +
                "house. I will not eat them with a mouse.";
        ArrayList<String> wordsV2 = new ArrayList<>(Arrays.asList(str.split(" ")));
        System.out.println(wordsV2);
        printXLetterWords(wordsV2);
    }

    //1
    public static int sumEvens(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i : nums) {
            if (i%2==0) {
                sum += i;
            }
        }
        return sum;
    }

    //2
    public static void print5LetterWords(ArrayList<String> list) {
        for (String word : list) {
            if (word.length()==5) {
                System.out.println(word);
            }
        }
    }

    //3
    public static void printXLetterWords(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("Preparing to prints words. How many characters should they have?");
        int X = input.nextInt();
        for (String word : words) {
            if (word.length()==X) {
                System.out.println(word);
            }
        }
        input.close();
    }
}
