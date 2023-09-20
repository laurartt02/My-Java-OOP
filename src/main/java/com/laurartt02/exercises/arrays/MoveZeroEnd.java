package com.laurartt02.exercises.arrays;

public class MoveZeroEnd {
    public static int[] moveZerosEnd(int[] v) {
        int[] out = new int[v.length];
        int i, j = 0;
        for(i = 0; i < v.length; i++) {
            if(v[i] != 0) {
                out[j] = v[i];
                j++;
            }
        }
        return out;
    }
}
