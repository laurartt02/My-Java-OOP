package com.laurartt02.exercises.strings;

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String string) {
        if(string.length() < 4) {
            return false;
        }
        return (string.charAt(0) == 'g' && string.charAt(1) == 'o' && string.charAt(2) == 'o' && string.charAt(3) == 'd');
    }
}
