public class NumberPyramid {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.err.print(i);
                if (j != i)
                    System.err.print(" ");
            }
            System.err.println();
        }
    }
}
