package com.company.sort;

import com.company.util.Compare;
import com.company.util.PrintArray;

public class InsertSort {
    public static void main(String[] args) {
        int[] a = {0,1,9,2,8,3,7,4,6,5};
        PrintArray.printArray(a);

        insertSort(a);

        PrintArray.printArray(a);

    }

    public static void insertSort(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
        	int index = i;
        	int temp = a[index];

        	for (int j = i; j-1 >= 0; j--) {
        		if (temp - a[j-1] < 0) {
        			index = j-1;
        			a[j] = a[j-1];
        		}
			}
        	a[index] = temp;
        }
    }
}











