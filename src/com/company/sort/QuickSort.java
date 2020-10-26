package com.company.sort;

import com.company.util.*;

import  com.company.util.Exch;


public class QuickSort {

	public static void main(String[] args) {
        int[] a = {0,1,9,2,8,3,7,4,6,5};
        PrintArray.printArray(a);

        quickSort(a, 0, a.length-1);

        PrintArray.printArray(a);

	}

	/**
	 * 
	 * @param a
	 */
    public static void quickSort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int j = position(a, lo, hi);
        quickSort(a, lo, j-1);
        quickSort(a, j+1, hi);
	}

    /**
     * 
     * @param a
     * @return
     */
    public static int position(int[] a, int lo, int hi) {
        int i = lo;
        int j = hi+1;
        int temp = a[lo];
        while (true) {
            while ( a[++i] < temp) {
                if (i >= hi) break;
            }
            while ( a[--j] > temp) {
                if (j <= lo) break;
            }
            if ( i >= j) break;
            Exch.exch(a, i, j);
        }
        Exch.exch(a, lo, j);
        return j;
	}





}














