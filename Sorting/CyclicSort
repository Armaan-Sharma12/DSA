

import java.util.ArrayList;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
        System.out.println("Original Array: "+ Arrays.toString(arr));
        cycleSort(arr);
        System.out.println("After sorting: "+Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();

    }

    public static void cycleSort(int[] arr) {
       int start = 0;
       int last = arr.length - 1;
       while (start <= last) {
           int correctIndex = arr[start] - 1;
           if(start == correctIndex) {
               start++;
           } else{
               swap(arr,start,correctIndex);
           }
       }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
