
public class mazeWithObstacle {
    public static void main(String[] args) {
        boolean [][] arr = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        path(arr,"",0,0);
    }
    public static void path(boolean[][] arr,String p ,int r , int c){
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(p);
            return;
        }
        if(!arr[r][c]){
            return;
        }

        if(r< arr.length-1) {
                path(arr,p + 'D', r + 1, c);

        }
        if(c< arr[0].length-1) {
                path(arr, p + 'R', r, c + 1);
        }
    }
}
