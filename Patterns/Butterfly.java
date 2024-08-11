public class Butterfly {
    static int n = 10;

    static void handlePrint(int i) {
        if (i > n / 2)
            i = n - i + 1;
        for (int j = 0; j < i; j++) {
            System.err.print("*");
        }
        for (int j = 0; j < n - (i * 2); j++) {
            System.err.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.err.print("*");
        }
        System.err.println();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= n; i++)
            handlePrint(i);
    }
}