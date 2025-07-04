
import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4,-1},
                {-10,5,11},
                {18,-7,6}
        };
        System.out.println("Original Matrix");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Transposed Matrix");
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] array = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                array[j][i] = matrix[i][j];
            }
        }
        return array;
    }

}
