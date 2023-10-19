package com.laurartt02.exercises.strings;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String string) {
        if(string.length() <= 3) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i <= string.length(); i++) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }
}
