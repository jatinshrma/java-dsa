public class Diamond {
    static int n = 7;
    static int N = (n + 1) / 2;

    static void handlePrint(int i) {
        if (i > N)
            i = n - i + 1;

        for (int j = 0; j < N - i; j++) {
            System.err.print(" ");
        }

        for (int j = 0; j < (i * 2 - 1); j++) {
            System.err.print("*");
        }

        System.err.println();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= n; i++)
            handlePrint(i);
    }
}
