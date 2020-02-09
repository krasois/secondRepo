package com.vsc.strings;

import java.util.Scanner;

public class LoopConcat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();

        System.out.println(formattedNumbers(index));
    }

    public static String formattedNumbers(int endNumber) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= endNumber; i++) {
            sb.append(i).append(",");
        }

        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
