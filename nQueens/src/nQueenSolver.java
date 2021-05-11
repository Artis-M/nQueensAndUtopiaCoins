public class nQueenSolver {

    final int Queens = 4;

    int[][] solveQueen() {
        int board[][] = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        if (qSolverUtil(board, 0) == false) {
            return null;
        }
        return board;
    }

    boolean qSolverUtil(int board[][], int col) {
        if (col >= Queens)
            return true;

        for (int i = 0; i < Queens; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (qSolverUtil(board, col + 1) == true)
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    boolean isSafe(int board[][], int row, int col) {
        int i, j;
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
        for (i = row, j = col; j >= 0 && i < Queens; i++, j--)
            if (board[i][j] == 1)
                return false;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;
        return true;
    }
}
