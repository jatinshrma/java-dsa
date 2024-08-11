public class SortArray {
    public static void main(Strings[] args) {
        int[][] values = {
                { 20, 12, 50, 43, 69, 83, 84, 30 },
                new int[8]
        };
        boolean[] processed = new boolean[8];

        for (int i = 0; i < values[0].length; i++) {
            int tempIndex = -1;
            values[1][i] = Integer.MAX_VALUE;

            for (int j = 0; j < values[0].length; j++) {
                if (values[0][j] < values[1][i] && !processed[j] && (i == 0 || values[1][i - 1] <= values[0][j])) {
                    tempIndex = j;
                    values[1][i] = values[0][j];
                }
            }

            processed[tempIndex] = true;
        }

        System.out.print("Unsorted: ");
        for (int u : values[0]) {
            System.out.print(u + ", ");
        }
        System.out.println();
        System.out.print("Sorted: ");
        for (int s : values[1]) {
            System.out.print(s + ", ");
        }
    }
}
