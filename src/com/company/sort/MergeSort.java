package com.company.sort;

import com.company.util.PrintArray;

public class MergeSort {


    public static void main(String[] args) {
        int[] a = {0,1,9,2,8,3,7,4,6,5};
        PrintArray.printArray(a);

        int[] aux = new int[a.length];
        //mergeSort(a, aux, 0, a.length-1);
        mergeSort01(a, aux, 0, a.length-1);


        PrintArray.printArray(a);

    }
    
    	
    
    
    /**
     * 由变小的归并
     */
    public static void mergeSort01(int[] a, int[] aux, int lo, int hi) {
    	int sz = 2;
    	for (int i = 0; i < a.length; i+=sz) {
    		
    	}
    	
    }

    
    
    
    
    public static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        if (lo >= hi) return;
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        
        int i = lo;
        int j = mid+1;
        for (int k = lo; k <= hi; k++) {
         	if      (i > mid)            a[k] = aux[j++];
        	else if (j > hi)             a[k] = aux[i++];
        	else if (aux[i] < aux[j])    a[k] = aux[i++];
        	else                         a[k] = aux[j++];

       	
        }

    }


   /**
           *由小到大的归并
    * @param a
    * @param aux
    * @param lo
    * @param hi
    */
   public static void mergeSort(int[] a, int[] aux, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        mergeSort(a, aux, lo, mid);
        mergeSort(a, aux , mid + 1, hi);
        merge(a, aux, lo, mid, hi);


   }
}











