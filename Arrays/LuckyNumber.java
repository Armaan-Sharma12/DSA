

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {

    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            int min=matrix[i][0];
            int colind=0;
            for(int r=1;r<col;r++){
                if(matrix[i][r]<min){
                    min=matrix[i][r];
                    colind=r;
                }
            }
            boolean flag=true;
            for(int c=0;c<row;c++){
                if(matrix[c][colind]>min){
                    flag=false;
                    break;
                }
            }
            if(flag){
                res.add(min);
            }
        }
        return res;
    }
//    public static int minInCol(int[] arr,int start, int end){
//        int min = Integer.MAX_VALUE;
//        for (int j=start;j<end;j++) {
//            min = Math.min(min, arr[j]);
//        }
//        return min;
//    }

}
