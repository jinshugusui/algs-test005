package com.company.sort;

import com.company.util.PrintArray;

public class MergeSort {


    public static void main(String[] args) {
        int[] a = {0,1,9,2,8,3,7,4,6,5};
        PrintArray.printArray(a);

        int[] aux = new int[a.length];
        mergeSort(a, aux, 0, a.length-1);

        PrintArray.printArray(a);

    }

    public static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        if (lo >= hi) return;
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }


    }


   public static void mergeSort(int[] a, int[] aux, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        mergeSort(a, aux, lo, mid - 1);
        mergeSort(a, aux , mid, hi);

        merge(a, aux, lo, mid, hi);


   }
}
