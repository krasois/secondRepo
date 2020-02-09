package com.vsc.strings;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        String[] data = {"Ivan Ivanov", "Bulgaria", "Sofia", "Ulica", "23020"};
        System.out.println(formatLetter(data));
    }

    public static String formatLetter(String[] data) {
        return String.format("%s\n%s\n%s\n%s\n%s", data[0], data[1],
                data[2], data[3], data[4]);
    }
}
