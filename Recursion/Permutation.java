import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String string = "ABC";
        ArrayList<String> list = extractPermutations(string, "");
        System.out.println(list);
    }

    public static ArrayList<String> extractPermutations(String string, String processed) {
        ArrayList<String> list = new ArrayList<>();

        if (string.isEmpty()) {
            list.add(processed);
            return list;
        }

        char ch = string.charAt(0);
        String subString = string.substring(1);

        for (int i = 0; i <= processed.length(); i++) {
            String l = processed.substring(0, i);
            String r = processed.substring(i);
            list.addAll(extractPermutations(subString, l + ch + r));
        }

        return list;
    }
}
