package com.vsc.strings;

public class IndexOfJava {

    public static void main(String[] args) {
        String first = "I like Java";
        String java = "Java";

        int index = firstPosition(null, java);
        System.out.println(index);
    }

    public static int firstPosition(String mainString, String partString) {
        if (mainString == null || partString == null) {
            return -5;
        }

        if (mainString.length() == 0) {
            return -3;
        }

        return mainString.indexOf(partString);
    }
}
