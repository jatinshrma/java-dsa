class ReverseNumber {
    public static int withLoop(int n) {
        int r = 0;
        while (n > 0) {
            r = (r * 10) + (n % 10);
            n /= 10;
        }

        return r;
    }

    public static int withRecursion(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int r) {
        if (n == 0)
            return r;
        return helper((n / 10), (r * 10) + (n % 10));
    }

    public static void main(String[] args) {
        int num = 23456789;
        int rev = withLoop(num);
        // int rev = withRecursion(num);

        System.out.println("Number: " + num);
        System.out.println("Reversed: " + rev);
        System.out.println("Plindrome: " + (rev == num));
    }
}