package com.company.sort;

import com.company.util.*;


public class QuickSort {

	public static void main(String[] args) {
        int[] a = {0,1,9,2,8,3,7,4,6,5};
        PrintArray.printArray(a);

        quickSort(a, 0, a.length);

        PrintArray.printArray(a);

	}

	/**
	 * 
	 * @param a
	 * @param h
	 * @param t
	 */
    public static void quickSort(int[] a, int h, int t) {

        int j = position(a, h, t);
        quickSort(a, h, j-1);
        quickSort(a, j+1, t);
	}

    /**
     * 
     * @param a
     * @param h
     * @param t
     * @return
     */
    public static int position(int[] a, int h, int t) {
		int j = h;
		while (h < t) {
			while (a[++h] < a[j]) {
				if (h >= t) break;
			}

			while (a[--t] > a[j]) {
				if (h >= t) break;
			}
				
			Exch.exch(a, h, t);
		}
		Exch.exch(a, j, t);
		return j;
	}





}














