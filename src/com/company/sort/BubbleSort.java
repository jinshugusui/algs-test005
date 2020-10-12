package com.company.sort;

import com.company.util.Compare;
import com.company.util.Exch;
import com.company.util.PrintArray;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {0,1,9,2,8,3,7,4,6,5};
        PrintArray.printArray(a);

        bubbleSort(a);

        //say hello
        //say hi hello world
        PrintArray.printArray(a);
    }

    public static void bubbleSort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i; j < N - 1 - i; j++) {
                if (Compare.alessb(a, j+1, j)) {
                    Exch.exch(a, j+1, j);
                }
            }
        }
    }
}
