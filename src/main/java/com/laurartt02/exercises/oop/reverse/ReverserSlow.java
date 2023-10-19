package com.laurartt02.exercises.oop.reverse;

public class ReverserSlow implements Reverser{
    @Override
    public String reverse(String s) {
        char[] c = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            c[s.length() - i - 1] = s.charAt(i);
        }
        return String.valueOf(c);
    }
}
