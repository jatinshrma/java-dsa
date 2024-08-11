import java.util.ArrayList;

public class DialpadLetters {
    static String[] dialpad = {
            "ABC",
            "DEF",
            "GHI",
            "JKL",
            "MNO",
            "PQRS",
            "TUV",
            "WXYZ"
    };

    public static void main(String[] args) {
        int input = 2;
        ArrayList<String> list = function(String.valueOf(input), "");
        System.out.println(list);
    }

    public static ArrayList<String> function(String input, String processed) {
        ArrayList<String> list = new ArrayList<>();

        if (input.isEmpty()) {
            list.add(processed);
            return list;
        }

        String letters = dialpad[Character.getNumericValue(input.charAt(0)) - 2];

        for (int i = 0; i < letters.length(); i++)
            list.addAll(function(input.substring(1), processed + letters.charAt(i)));

        return list;
    }
}
