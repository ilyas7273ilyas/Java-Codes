public class Print_1_Sol {
    //N Knights
    public static boolean isSafe(char board[][], int row, int col) {
        //Vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //Diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        //Diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static int count=0;

    public static boolean nQueens(char board[][], int row) {
        //base 
        if(row == board.length) {
            //printBoard(board);
            count++;  // Count the total no. of ways to solve N-Queens
            return true;
        }
        //column loop
        for(int j=0;j<board.length;j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueens(board, row+1)) {
                    return true;
                }  
                board[row][j] = 'X';  //backtracking step
            }
        }

        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("------chess board------");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n=2;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j] = 'X';
            }
        }

        if(nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        }
        else {
            System.out.println("Solution is not possible");
        }
    }
}

