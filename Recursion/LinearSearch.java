import java.util.ArrayList;

public class LinearSearch {
    public static int findIndex(int[] arr, int target, int index, int diff, int stopIndex) {
        if (index == stopIndex)
            return -1;

        if (arr[index] == target)
            return index;

        return findIndex(arr, target, index + diff, diff, stopIndex);
    }

    public static int findIndex(int[] arr, int target) {
        return findIndex(arr, target, 0, 1, arr.length);
    }

    public static int findLastIndex(int[] arr, int target) {
        return findIndex(arr, target, arr.length - 1, -1, 0);
    }

    public static ArrayList<Integer> findAllIndexesHelper(int[] arr, int target,
            int index,
            ArrayList<Integer> indexes) {
        if (index == arr.length)
            return indexes;

        if (arr[index] == target)
            indexes.add(index);

        return findAllIndexesHelper(arr, target, index + 1, indexes);
    }

    public static ArrayList<Integer> findAllIndexes(int[] arr, int target) {
        ArrayList<Integer> indexes = new ArrayList<>();
        return findAllIndexesHelper(arr, target, 0, indexes);
    }

    public static ArrayList<Integer> findAllIndexesWOHelper(int[] arr, int target, int index) {
        ArrayList<Integer> indexes = new ArrayList<>();

        if (index == arr.length)
            return indexes;

        if (arr[index] == target)
            indexes.add(index);

        ArrayList<Integer> result = findAllIndexesWOHelper(arr, target, index + 1);
        indexes.addAll(result);

        return indexes;
    }

    public static void main(String[] args) {
        int[] arr = { 120, 84, 73, 92, 84, 7332, 84, 382, 392, };
        int target = 84;

        System.out.println("Index: " + findIndex(arr, target));
        System.out.println("Last Index: " + findLastIndex(arr, target));
        System.out.println("All Indexes: " + findAllIndexesWOHelper(arr, target, 0));
    }
}
