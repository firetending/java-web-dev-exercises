package org.launchcode.java.demos.lsn1datatypes;

import java.util.Scanner;
public class HelloMethods {

    public static void main(String[] args) {
        System.out.println("Choose a language (fr, sp, eng, orc):");
        Scanner input = new Scanner(System.in);
        String language = input.next();
        input.close();
        String message = Message.getMessage(language);
        System.out.println(message.concat(" :)"));
    }

}
