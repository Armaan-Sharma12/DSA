

import java.util.Arrays;

public class MergeSortRecursion {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,2};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] sort(int[] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }
    public static int[] merge(int[] first, int[] second){
        int[] result = new int[first.length+ second.length];
        int i = 0, j = 0,k=0;
        while(i< first.length && j< second.length){
            if(first[i]< second[j]){
                result[k] = first[i];
                i++;
            } else{
                result[k] = second[j];
                j++;
            }
            k++;
        }

        while(i< first.length){
            result[k] = first[i];
            i++;
            k++;
        }

        while(j< second.length){
            result[k] = second[j];
            j++;
            k++;
        }
        return result;
    }
}
