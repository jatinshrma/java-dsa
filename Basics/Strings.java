public class Strings {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ghello";

        System.out.println(s1 == s2);

        String s3 = new String("hello");
        System.out.println(s1 == s3);

        String s4 = "hello buddy!";
        System.out.println(s4.contains(s3));

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.indexOf(s1));
        System.out.println(s2.indexOf("llo", 2));

        s4 = s1;
        s1 = s1 + s2;
        s3 = s4 + s2;

        System.out.println(s1 + ", " + s3);
        System.out.println(s1 == s3);
        System.out.print(s1.equals(s3));

        System.out.println("hello".equalsIgnoreCase("HELLO"));
    }
}
