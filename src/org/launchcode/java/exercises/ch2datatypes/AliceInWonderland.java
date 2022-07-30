package org.launchcode.java.exercises.ch2datatypes;

import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Search term:");
        String term = input.nextLine().toLowerCase();
        System.out.println(alice.toLowerCase().contains(term));
        System.out.println("Do you want bonus info? (y/n)");
        String bonus = input.nextLine().toLowerCase();
        //do next exercise
        if (bonus.equals("y")) {
            int termIndex = alice.toLowerCase().indexOf(term);
            System.out.println("Search term first found at index: "+termIndex);
            System.out.println("Would you like to remove the first occurrence or all occurrences? (first/all)");
            String replace = input.nextLine().toLowerCase();
            String aliceNew;
            String termCensor = "";
            for (int i = 0; i < term.length(); i++) {
                termCensor += "*"; //create string of * the length of search term for replacement
            }
            if (replace.equals("first")) {
                aliceNew = alice.toLowerCase().replaceFirst(term, termCensor);
                System.out.println("Search term removed (first occurrence): ");
            } else {
                aliceNew = alice.toLowerCase().replaceAll(term, termCensor);
                System.out.println("Search term removed (all occurrences): ");
            }
            System.out.println(aliceNew);
        }
        input.close();
    }
}
