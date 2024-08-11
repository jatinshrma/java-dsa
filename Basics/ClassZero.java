import java.io.*;

class ClassZero {
    public static void main(Strings args[]) throws IOException {
        // Print: Hello World!
        System.out.println("Hello world!");

        // Primitive data types
        boolean ready = true;

        byte aByte = 10; // -2^7 -> 2^7 - 1 = 2^8
        short aShort = 10; // -2^15 -> 2^15 - 1 = 2^16
        int aInt = 10; // -2^32 -> 2^32 - 1 = 2^32
        long aLong = 10; // -2^63 -> 2^63 - 1 = 2^64

        float weightFloat = (float) 2.1;
        double weight = 70.5;
        final int MAX_AGE = 30;

        // char aChar = "M"; // 16 bit

        // Buffered Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a integer");

        int line = Integer.parseInt(br.readLine());
        System.out.println("You entered: " + line);
    }
}