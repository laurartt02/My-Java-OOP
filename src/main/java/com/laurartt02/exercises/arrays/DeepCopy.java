package com.laurartt02.exercises.arrays;

import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for(int i = 0; i < original.length; i++) {
            copy[i] = Arrays.copyOf(original[i], original.length);
        }
        return copy;
    }
}
