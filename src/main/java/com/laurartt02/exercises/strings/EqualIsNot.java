package com.laurartt02.exercises.strings;

public class EqualIsNot {
    private static int numberOfOccurrence(String s, String search) {
        int lastOccurrence = 0;
        int ret = 0;
        while (true) {
            lastOccurrence = s.indexOf(search, lastOccurrence);
            if(lastOccurrence < 0) {
                break;
            }
            ret++;
            lastOccurrence++;
        }
        return ret;
    }
    public static boolean equalIsNot(String s) {
        int isOccurrence = numberOfOccurrence(s, "is");
        int notOccurrence = numberOfOccurrence(s, "not");
        return isOccurrence == notOccurrence;
    }
}
