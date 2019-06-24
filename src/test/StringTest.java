package test;

/**
 * Created by zihao on 2019/6/18.
 */
public class StringTest {
    public static void main(String[] args) {
        String t = "aa";
        t = t.substring(2);
        System.out.println(t);

        int a=1;
        int b=4;
        System.out.println(a ^ b);
        System.out.println((a & b)<<1);
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
