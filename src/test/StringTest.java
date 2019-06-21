package test;

/**
 * Created by zihao on 2019/6/18.
 */
public class StringTest {
    public static void main(String[] args) {
        String t = "aa";
        t = t.substring(2);
        System.out.println(t);

        String s1 = "039B795B01CB3F0B0001000000001468CD7F";

        System.out.println(Long.parseLong("1231"));
        System.out.println(Long.valueOf(s1));
    }

    private static boolean isLong(String s) {
        try {
            long long1 = Long.parseLong(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
