public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.err.print(" ");
            }

            for (int j = i; j > 0; j--) {
                System.err.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.err.print(j);
            }

            System.err.println();
        }
    }
}
