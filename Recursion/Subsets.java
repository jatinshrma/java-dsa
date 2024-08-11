import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        String string = "ABC";
        int[] nums = { 1, 2, 3 };

        // ArrayList<String> subsets1 = extractSubsetsWHelper(string);
        ArrayList<String> subsets1 = extractSubsetsRecursion(string, "");
        ArrayList<ArrayList<Integer>> subsets2 = extractSubsetsWIteration(nums);

        System.out.println(subsets1);
        System.out.println(subsets2);
    }

    public static ArrayList<String> extractSubsetsRecursion(String value, String processed) {
        if (value.length() == 0) {
            ArrayList<String> result = new ArrayList<>();
            result.add(processed);
            return result;
        }

        ArrayList<String> exclusiveResult = extractSubsetsRecursion(
                value.substring(1),
                processed);

        ArrayList<String> inclusiveResult = extractSubsetsRecursion(
                value.substring(1),
                processed + value.charAt(0));

        exclusiveResult.addAll(inclusiveResult);
        return exclusiveResult;
    }

    public static void extractSubsetsHelper(
            String value,
            String processed,
            ArrayList<String> subsets) {

        if (value.length() == 0) {
            subsets.add(processed);
            return;
        }

        extractSubsetsHelper(
                value.substring(1),
                processed,
                subsets);

        extractSubsetsHelper(
                value.substring(1),
                processed + value.charAt(0),
                subsets);
    }

    public static ArrayList<String> extractSubsetsWHelper(String value) {
        ArrayList<String> subsets = new ArrayList<>();
        extractSubsetsHelper(value, "", subsets);
        return subsets;
    }

    public static ArrayList<ArrayList<Integer>> extractSubsetsWIteration(int[] arr) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        for (int item : arr) {
            int listSize = list.size();
            for (int i = 0; i < listSize; i++) {
                ArrayList<Integer> newList = new ArrayList<>();
                newList.addAll(list.get(i));
                newList.add(item);
                list.add(newList);
            }
        }

        return list;
    }
}
