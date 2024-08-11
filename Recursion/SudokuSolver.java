public class SudokuSolver {
    public static void main(String[] args) {
        int board[][] = {
                { 0, 0, 0, 5, 0, 0, 0, 0, 0 },
                { 6, 5, 3, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 5, 0, 9, 0, 6, 0, 0, 0, 2 },
                { 0, 0, 0, 1, 0, 4, 0, 0, 0 },
                { 4, 1, 0, 0, 0, 5, 0, 7, 0 },
                { 0, 0, 4, 0, 0, 0, 0, 0, 7 },
                { 3, 9, 0, 0, 7, 0, 2, 0, 0 },
                { 0, 0, 0, 2, 0, 0, 0, 0, 0 }
        },
                counts[] = new int[2];

        counts[0] = 10;
        System.out.println("Processing to find " + counts[0] + " solution" +
                (counts[0] > 1 ? "s" : "")
                + ":\n");

        solveN(board, 0, 0, 1, counts);

        System.out.println("Found " + counts[1] + " solution" +
                (counts[1] > 1 ? "s" : "")
                + ".");
    }

    public static int solveN(int[][] board, int row, int col, int value, int[] counts) {
        if (counts[0] == counts[1])
            return 0;

        if (row == board.length) {
            System.out.println((++counts[1]) + " ***************\n");
            displayBoard(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        if (col == board.length) {
            count += solveN(board, row + 1, 0, 1, counts);
        } else if (board[row][col] > 0) {
            count += solveN(board, row, col + 1, 1, counts);
        } else {
            boolean safe = isSafe(board, row, col, value);
            if (safe) {
                board[row][col] = value;
                count += solveN(board, row, col + 1, 1, counts);
                board[row][col] = 0;
            }
            if (value < 9) {
                count += solveN(board, row, col, value + 1, counts);
            }
        }

        return count;
    }

    public static boolean isSafe(int[][] board, int row, int col, int value) {
        // check in rows
        for (int i = 0; i < 9; i++) {
            if (i == row)
                continue;
            if (board[i][col] == value)
                return false;
        }

        // check in cols
        for (int i = 0; i < 9; i++) {
            if (i == col)
                continue;
            if (board[row][i] == value)
                return false;
        }

        // check in sqr
        int xSqr = (row / 3) + 1;
        int ySqr = (col / 3) + 1;

        for (int x = 3 * (xSqr - 1); x < 3 * xSqr; x++) {
            for (int y = 3 * (ySqr - 1); y < 3 * ySqr; y++) {
                if (board[x][y] == value)
                    return false;
            }
        }

        return true;
    }

    public static void displayBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
