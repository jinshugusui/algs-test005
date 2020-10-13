package com.company.sort;

import com.company.util.Compare;
import com.company.util.Exch;
import com.company.util.PrintArray;

public class SelectSort {


    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,0};
        PrintArray.printArray(a);

        selectSort(a);

        PrintArray.printArray(a);
    }


    public static void selectSort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min  = i;
            for (int j = i; j < N; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            Exch.exch(a, i, min);
        }

    }



}
