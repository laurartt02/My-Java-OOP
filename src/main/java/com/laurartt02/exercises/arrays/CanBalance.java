package com.laurartt02.exercises.arrays;

public class CanBalance {
    public static int sum(int[] v, int start, int end) {
        int sum = 0;
        for(int i = start; i < end; i++) {
            sum += v[i];
        }
        return sum;
    }
    public static boolean canBalance(int[] v) {
        if(v.length < 2) {
            return false;
        }
        boolean res = false;
        for(int i = 0; i < v.length; i++) {
            int sumSubArray1 = sum(v,0,i);
            int sumSubArray2 = sum(v,i,v.length);
            if(sumSubArray1 == sumSubArray2) {
                res = true;
                break;
            }
        }
        return res;
    }
}
