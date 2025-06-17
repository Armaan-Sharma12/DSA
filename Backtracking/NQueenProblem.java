

public class NQueenProblem {
    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
//        nQueen(board,0);
        System.out.println(nQueen(board,0));
    }
    public static int nQueen(boolean[][] board, int r){
        if(r == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        //placing the queen
        int count  = 0;
        for (int col = 0; col < board.length; col++) {
          if(isSafe(board,r,col)){
              board[r][col] = true;
              count+= nQueen(board,r+1);
              board[r][col] = false;
          }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical row
        for (int i = 0 ; i < row; i++) {
            if(board[i][col]) return false;
        }
        //diagonal left
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft ; i++) {
            if(board[row-i][col-i]) return false;
        }

        //diagonal right
        int maxRight = Math.min(row,board.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) return false;
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean element: row){
                if(element) System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
    }
}
