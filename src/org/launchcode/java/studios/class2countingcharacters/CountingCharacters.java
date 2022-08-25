package org.launchcode.java.studios.class2countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to" +
                " be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        System.out.println("default string counts:");
        printCharCounts(str);
        printCharCounts(getStringInput());
    }
    public static String newLine = System.lineSeparator();

    public static String getStringInput(){
        Scanner input = new Scanner(System.in);
        System.out.println(newLine+"Enter a string:");
        String str = input.nextLine();
        input.close();
        return str;
    }

    public static void printCharCounts(String inputText) {

        //counting pure
//        char[] inputArray = inputText.toCharArray();
//        HashMap<Character, Integer> charCounts = new HashMap<>();
//        for (char letter : inputArray) {
//            if (charCounts.containsKey(letter)) {
//                charCounts.put(letter, charCounts.get(letter) + 1);
//            } else {
//                charCounts.put(letter, 1);
//            }
//        }

        //bonus 2 refactor: make count case-insensitive
//        char[] inputArray = inputText.toLowerCase().toCharArray();
//        HashMap<Character, Integer> charCounts = new HashMap<>();
//        for (char letter : inputArray) {
//            if (charCounts.containsKey(letter)) {
//                charCounts.put(letter, charCounts.get(letter) + 1);
//            } else {
//                charCounts.put(letter, 1);
//            }
//        }

        //bonus 3 refactor: exclude non-alphabetic chars
        String inputAlphas = inputText.toLowerCase().replaceAll("[^a-z]","");
        char[] inputArray = inputAlphas.toCharArray();
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char letter : inputArray) {
            if (charCounts.containsKey(letter)) {
                charCounts.put(letter, charCounts.get(letter) + 1);
            } else {
                charCounts.put(letter, 1);
            }
        }

        //add count of unique characters
        int uniqueChars = charCounts.size();

        //print loop
        for (Map.Entry<Character, Integer> letter : charCounts.entrySet()) {
            System.out.println(String.format("%s: %s", letter.getKey(), letter.getValue()));
        }
        System.out.println("unique characters: "+uniqueChars);
    }
}