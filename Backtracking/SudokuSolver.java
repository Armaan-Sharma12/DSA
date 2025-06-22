

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = new char[9][9];
        solve(board);
    }
        public static boolean isValid(char c, char[][] board, int row, int col){
            for(int i = 0; i < board.length; i++){
                // Check row
                if(board[row][i] == c) return false;
                // Check column
                if(board[i][col] == c) return false;
                // Check 3x3 subgrid
                if(board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                    return false;
            }
            return true;
        }

        public static boolean solve(char[][] board){
            for(int row = 0; row < board.length; row++){
                for(int col = 0; col < board[0].length; col++){
                    if(board[row][col] == '.'){
                        for(char c = '1'; c <= '9'; c++){
                            if(isValid(c, board, row, col)){
                                board[row][col] = c;
                                if(solve(board)) return true;
                                board[row][col] = '.'; // backtrack
                            }
                        }
                        return false; // no valid digit found
                    }
                }
            }
            return true; // board successfully filled
        }

    }
    

