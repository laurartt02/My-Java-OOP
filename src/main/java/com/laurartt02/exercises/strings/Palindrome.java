package com.laurartt02.exercises.strings;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        if(string.isEmpty()) {
            return true;
        }
        String reversedString = new StringBuilder(string).reverse().toString();
        return reversedString.equalsIgnoreCase(string);
    }
}
