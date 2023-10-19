package com.laurartt02.exercises.strings;

public class Concatenate {
    public static String concatenate(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for(String s: strings) {
            sb.append(s); //s = strings index
        }
        return sb.toString();
    }
}
