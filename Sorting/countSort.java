

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countSort {
    //only for small numbers and is a stable algorithm
    //does not work well with big numbers and decimal numbers
    public static void countSortArr(int[] arr){
        if(arr.length == 0) return;
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest) largest = arr[i];
        }
        int[] newArray = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            newArray[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < newArray.length; i++) {
            while(newArray[i] > 0){
                arr[j++] = i;
                newArray[i]--;
            }
        }
    }

    public static void countSortHash(int[] arr){
        if(arr.length == 0) return;
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int index = 0;
        for(int num = min; num <= max; num++){
            int count = map.getOrDefault(num,0);
            while(count > 0){
                arr[index++] = num;
                count--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,2,4,5,1,3,1,2};
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }
}
