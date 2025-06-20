
import java.util.Arrays;

public class mazePathVariable {
    public static void main(String[] args) {
        boolean [][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][] path = new int[arr.length][arr[0].length];
        path(arr,"",0,0,path,1);
    }
    public static void path(boolean[][] arr,String p ,int r , int c, int[][] path, int step){
        if(r==arr.length-1 && c==arr[0].length-1){
            path[r][c] = step;
            for(int[] m : path){
                System.out.println(Arrays.toString(m));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!arr[r][c]){
            return;
        }
        arr[r][c] = false;
        path[r][c] = step;
        if(r < arr.length - 1) {
            path(arr, p + 'D', r + 1, c, path, step + 1);
        }

        // Move Right
        if(c < arr[0].length - 1) {
            path(arr, p + 'R', r, c + 1, path, step + 1);
        }

        // Move Up
        if(r > 0) {
            path(arr, p + 'U', r - 1, c, path, step + 1);
        }

        // Move Left
        if(c > 0) {
            path(arr, p + 'L', r, c - 1, path, step + 1);
        }

        arr[r][c] = true;
        path[r][c] = 0;
    }
}
