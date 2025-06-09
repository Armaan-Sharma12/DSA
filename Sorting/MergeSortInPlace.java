

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int s, int e ) {
        if(s >= e) return;
        int mid = s + (e - s) / 2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        merge(arr,s,mid,e);
    }
    public static void merge(int[] arr, int s, int m, int e) {
        int[] result = new int[e-s+1];
        int i = s, j = m+1,k=0;
        while(i<= m && j<= e){
            if(arr[i]< arr[j]){
                result[k] = arr[i];
                i++;
            } else{
                result[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<= m){
            result[k] = arr[i];
            i++;
            k++;
        }

        while(j<= e){
            result[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < result.length; l++) {
            arr[s+l] = result[l];
        }
    }
}
