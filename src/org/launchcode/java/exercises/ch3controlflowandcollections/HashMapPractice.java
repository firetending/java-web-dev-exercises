package org.launchcode.java.exercises.ch3controlflowandcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> roster = inputRoster();
        printRoster(roster);
    }

    public static HashMap<Integer,String> inputRoster(){
        HashMap<Integer,String> roster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int id = 0;
        String name = "";
        do {
            System.out.println("To Exit, enter negative number");
            System.out.println("Enter student ID#:");
            id = input.nextInt();
            if (id<0) {
                System.out.println("Roster complete!");
//                System.out.println(roster);
                break;
            }
            System.out.println("Enter student name:");
            name = input.next();
            roster.put(id, name);
//            System.out.println(roster);
            System.out.println("added, next!");
        } while (true);

        input.close();
        return roster;
    }

    public static void printRoster(HashMap<Integer,String> roster) {
        for (HashMap.Entry<Integer,String> student : roster.entrySet()) {
            System.out.println(student.getKey()+" "+ student.getValue());
        }
    }
}
