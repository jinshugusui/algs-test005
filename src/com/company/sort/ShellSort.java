package com.company.sort;

import com.company.util.Compare;
import com.company.util.Exch;
import com.company.util.PrintArray;

public class ShellSort {
    public static void main(String[] args) {
        int[] a = {0,1,9,2,8,3,7,4,6,5};
        PrintArray.printArray(a);

        shellSort(a);

        PrintArray.printArray(a);


    }


    public static void shellSort(int[] a) {
        int N = a.length;
        int h = 0;
        while (h < N/3) {
        	h = h * 3 + 1;
        }
        
       while (h >= 1) {
    	   for (int i = h; i < N; i++) {
    		   for (int j = i; j - h >= 0; j-=h) {
    			  if (Compare.alessb(a, j, j-h)) {
    				 Exch.exch(a, j, j-h); 
    			  }
    		   }
    	   }
    	   h = h/3;
       } 
        

    }
}

















