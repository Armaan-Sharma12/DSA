
import java.util.Arrays;

public class flipping {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int row=0;row<image.length;row++){
            reverseArray(image[row]);
            for(int j=0;j<image[row].length;j++){
                image[row][j] ^= 1;
            }
        }
        return image;
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
