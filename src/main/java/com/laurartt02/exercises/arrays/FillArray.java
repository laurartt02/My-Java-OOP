package com.laurartt02.exercises.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise) {
        double[] dst = new double[size];
        Arrays.fill(dst,value);
        if(addNoise) {
            RandomGenerator rnd = RandomGenerator.getDefault();
            double noise = Math.abs(value) * 0.05;
            for(int i = 0; i < dst.length; i++) {
                dst[i] += dst[i] + rnd.nextDouble(-noise, noise);
            }
        }
        return dst;
    }
}
