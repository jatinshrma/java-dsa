public class Fibonacci {
    public static void main(Strings[] args) {
        int i = 1;
        int j = 1;

        System.out.print(i + "+" + i + "+");
        for (int x = 0; x < 10; x++) {
            int temp = i + j;
            System.out.print(temp + "+");
            i = j;
            j = temp;
        }
    }
}
