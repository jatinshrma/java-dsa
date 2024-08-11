public class RotatedBinarySearch {
    public static int search(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;

        int m = s + (e - s) / 2;

        System.out.println(s + "," + m + "," + e);

        if (target == arr[m])
            return m;

        if (arr[s] <= arr[m])
            if (arr[s] <= target && target <= arr[m])
                e = m - 1;
            else
                s = m + 1;
        else if (arr[m] <= target && target <= arr[e])
            s = m + 1;
        else
            e = m - 1;

        return search(arr, target, s, e);
    }

    public static void main(String[] args) {
        int[] arr = { 70, 0, 1, 2, 3 };
        int target = 0;

        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
