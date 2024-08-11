import java.util.Scanner;

public class Pyramid {
    public static void main(Strings args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int rows = 0;

            while (rows <= 0) {
                System.out.println("Please enter the height of the pyramid: ");
                rows = sc.nextInt();
                if (rows <= 0) {
                    System.out.println("Number should be greater than zero.");
                    continue;
                }

                int y = 1;
                while (y <= rows) {
                    for (int x = 1; x <= rows - y; x++)
                        System.out.print("\s");

                    for (int x = 1; x <= 2 * y - 1; x++)
                        System.out.print("*");

                    System.out.println();
                    y++;
                }
            }
        }
    }
}