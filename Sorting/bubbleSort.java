

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr = {4,1,3,5,2};
        System.out.println("Original Array: "+Arrays.toString(arr));
        bubble(arr);
        System.out.println("After sorting: "+Arrays.toString(arr));
    }
    public static void bubble(int[] arr) {
        boolean swapped = false;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
