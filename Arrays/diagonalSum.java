
public class diagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(diagonalSum1(mat));

    }
    public static int diagonalSum1(int[][] mat) {
        //left diagonal sum
        int left = sum(mat,0,mat.length-1);
        //right diagonal sum
        int right = sum(mat,0,0);
        int correction = 0;
        if(mat.length%2!=0){
            int mid = mat.length/2;
            correction += mat[mid][mid];
        }
        return left+right-correction;

    }
    public static int sum(int[][] board, int row, int col) {
        int sum = 0;
        //check vertical row
//        for (int i = 0 ; i < row; i++) {
//            if(board[i][col]) return false;
//        }
        //diagonal left
        if(col!=0) {
//            int maxLeft = Math.min(row, col);
            for (int i = 0; i < board.length ; i++) {
                sum += board[row + i][col - i];
            }
        }
        //diagonal right
        if(col==0) {
//            int maxRight = Math.min(row, board.length - col - 1);
            for (int i = 0; i < board.length; i++) {
                sum += board[row + i][col + i];
            }
        }
        return sum;
    }

}
