public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        placeQueens(board, 0, 0, 0);
    }

    public static void placeQueens(boolean[][] board, int r, int c, int initialC) {
        if (c >= board.length || r >= board.length) {
            if (r == board.length) {
                displayBoard(board);
            }
            return;
        }

        boolean isSafe = true;

        for (int i = 1; i <= r; i++) {
            if (c - i >= 0 && board[r - i][c - i] == true) {
                isSafe = false;
                break;
            }
            if (board[r - i][c] == true) {
                isSafe = false;
                break;
            }
            if (c + i < board.length && board[r - i][c + i] == true) {
                isSafe = false;
                break;
            }
        }

        if (isSafe) {
            board[r][c] = true;
            placeQueens(board, r + 1, 0, initialC);
            board[r][c] = false;

            if (r == 0 && initialC < board.length) {
                initialC++;
                placeQueens(board, 0, initialC, initialC);
            }
        } else
            placeQueens(board, r, c + 1, initialC);
    }

    public static void displayBoard(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}