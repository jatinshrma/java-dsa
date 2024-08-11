public class StringOperations {
    static int exponentiation(int num, int exponent) {
        if (exponent == 0)
            return 1;
        else
            return num * exponentiation(num, exponent - 1);
    }

    static void findPatters(String str, String p) {
        int[] iterationIndexes = new int[str.length()];
        int iterationsCount = 0;

        for (int i = 0; i < str.length() - p.length() + 1; i++) {
            String substr = str.substring(i, i + p.length());

            if (substr.equals(p)) {
                iterationIndexes[iterationsCount] = i;
                iterationsCount++;
            }
        }

        System.out.print(iterationsCount + " iterations found at indexes: ");
        for (int i = 0; i < iterationsCount; i++) {
            System.out.print(iterationIndexes[i]);
            if (i < iterationsCount - 1)
                System.out.print(", ");
        }
    };

    static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + (str.charAt(i));
        }

        return reverse;
    };

    static Boolean checkPolidrome(String str) {
        boolean isPolidrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPolidrome = false;
                break;
            }
        }

        return isPolidrome;
    }

    static String decimalToBinary(int num) {
        String binary = "";

        while (num != 1) {
            binary = (num % 2) + binary;
            num = num / 2;

            if (num == 1)
                binary = num + binary;
        }

        return binary;
    }

    static int binaryToDecimal(String binary) {
        int decimal = 0;
        int k = 1;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(binary.substring(i, i + 1));
            if (binary.length() - 1 - i > 0)
                k = k * 2;
            decimal += digit * k;
        }

        return decimal;
    }

    public static void main(String[] args) {
    }
}
