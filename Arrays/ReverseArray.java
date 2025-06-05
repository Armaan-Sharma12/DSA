
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        arr = reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
