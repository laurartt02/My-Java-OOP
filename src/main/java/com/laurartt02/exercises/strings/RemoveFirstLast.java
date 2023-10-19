package com.laurartt02.exercises.strings;

public class RemoveFirstLast {
    public static String removeFirstLast(String string) {
        if (string.length() < 2) {
            return string;
        }
        char first = string.charAt(0); //first char of string
        char last = string.charAt(string.length() - 1); //last char of string
        if (first == last) {
            return string.substring(1,string.length() - 1);
        }
        return string;
    }
}
