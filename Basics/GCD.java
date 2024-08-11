import java.util.Scanner;

public class GCD {
    public static void main(Strings args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter numbers saperated by commas (,) e.g. 1,2:");
            String[] array = (sc.nextLine()).split(",");
            int[] numbers = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                numbers[i] = Integer.parseInt(array[i]);
            }

            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++)
                if (numbers[i] < min)
                    min = numbers[i];

            for (int i = min; i > 0; i--) {

                int divisibleScore = 0;

                for (int num : numbers) {
                    if (num % i == 0)
                        divisibleScore++;
                }

                if (divisibleScore == numbers.length) {
                    System.out.println("GCD, for the given set of numbers, is: " + i);
                    break;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
