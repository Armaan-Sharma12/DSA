
import java.util.Arrays;

public class sorted2DMatrix {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr, 11)));
    }
    static int [] binarySearch(int[][] matrix,int row, int cstart, int cend, int target){
        while(cstart<=cend){
            int mid = cstart+(cend-cstart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cstart=mid+1;
            }else {

                cend = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int [] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        if(col==0){
            return new int[0];
        }
        if(row==1){
            return binarySearch(matrix,0,0,col-1,target);
        }
        return binarySearch(matrix,row-1,0,col,target);
    }
}
