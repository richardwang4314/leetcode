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
        System.out.println(Long.parseLong(s1.substring(0,4),16));
        System.out.println(Long.parseLong(s1.substring(4,8),16));
        System.out.println(s1.substring(0,16));
        System.out.println(s1.substring(16,32));
    }
}
