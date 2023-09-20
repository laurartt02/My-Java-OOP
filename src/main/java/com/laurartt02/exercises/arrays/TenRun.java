package com.laurartt02.exercises.arrays;

public class TenRun {
    public static int[] tenRun(int[] v) {
        int dst[] = new int[v.length];
        boolean found = false; //find the multiple of 10
        int ten = 0;
        for(int i = 0; i < v.length; i++) {
            if(v[i] % 10 == 0) {
                ten = v[i];
                found = true;
            }
            //Condition? true : false
            //dst[i]=found? ten : v[i]
            if(found) {
                dst[i] = ten;
            }
            else {
                dst[i] = v[i];
            }
        }
        return dst;
    }
}
