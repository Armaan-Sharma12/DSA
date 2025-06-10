

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {4,1,3,5,2};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        selection(arr);
        System.out.println("After sorting: "+Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last=arr.length-i-1;
            int getMax = max(arr,0,last);
            swap(arr,getMax,last);
        }
    }

    public static int max(int[] arr, int start, int end){
        int max=start;
        for (int i = start; i <= end ; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
