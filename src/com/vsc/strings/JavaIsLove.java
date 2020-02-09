package com.vsc.strings;

import java.util.Scanner;

public class JavaIsLove {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        String myFavouriteProgrammingLanguage = input.nextLine();
        if (myFavouriteProgrammingLanguage.equalsIgnoreCase("java")) {
            System.out.println("Good choice!");
        } else {
            System.out.println("Try again!");
        }
    }
}
