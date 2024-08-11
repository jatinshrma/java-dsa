public class NKnights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[5][5];
        int target = 12;
        System.out.println("Possible solutions: " + placeNKnights(board, 0, 0, target));
    }

    public static int placeNKnights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            displayBoard(board);
            return 1;
        }

        int _count = 0;
        if (col >= board.length) {
            _count += placeNKnights(board, row + 1, 0, knights);
        } else if (row < board.length) {
            // Choises

            // 1. Placing knight here
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                _count += placeNKnights(board, row, col + 1, knights - 1);
                board[row][col] = false;
            }

            // 2. Not placing knight here
            _count += placeNKnights(board, row, col + 1, knights);
        }

        return _count;
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        return ((row < 1 || col < 2 || !board[row - 1][col - 2]) &&
                (row < 1 || col + 2 >= board.length || !board[row - 1][col + 2]) &&
                (row < 2 || col < 1 || !board[row - 2][col - 1]) &&
                (row < 2 || col + 1 >= board.length || !board[row - 2][col + 1]));
    }

    public static void displayBoard(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]) {
                    System.out.print("K ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}