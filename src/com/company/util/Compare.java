package com.company.util;

public class Compare {
    public static boolean alessb(int[] a, int i, int j) {
        return a[i] - a[j] < 0;
    }


    public static boolean abigb(int[] a, int i, int j) {
        return a[i] - a[j] > 0;
    }
}
