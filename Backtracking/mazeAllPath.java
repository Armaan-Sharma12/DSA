
import java.util.Arrays;

public class mazeAllPath {
    public static void main(String[] args) {
        boolean [][] arr = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        path(arr,"",0,0);
        System.out.println(Arrays.deepToString(arr));
    }
    public static void path(boolean[][] arr,String p ,int r , int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[r][c]){
            return;
        }

        if(r< arr.length-1 && arr[r][c]) {
            arr[r][c] = false;
            path(arr,p + 'D', r + 1, c);
            arr[r][c] = true;
        }
        if(c< arr[0].length-1 && arr[r][c]) {
            arr[r][c] = false;
            path(arr, p + 'R', r, c + 1);
            arr[r][c] = true;
        }
        if(r>0 && arr[r][c]) {
            arr[r][c] = false;
            path(arr, p + 'U', r-1, c);
            arr[r][c] = true;
        }
        if(c>0 && arr[r][c]) {
            arr[r][c] = false;
            path(arr, p + 'L', r, c - 1);
            arr[r][c] = true;
        }


    }
}
