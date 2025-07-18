package com.sorting;

import java.util.Arrays;

public class RadixSort {
    public static void radixSort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int digits = (int)(Math.log10(max))+1;
        for (int i = 1;max/i >0 ; i*=10) {
            countSort(arr,i);
        }
    }
    public static void countSort(int[] arr, int exp){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];
        Arrays.fill(count,0);
        for (int i = 0; i < n; i++) {
            count[(arr[i]/exp)%10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i]+=count[i-1];
        }
    }
}
