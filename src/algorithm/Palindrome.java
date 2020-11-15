package algorithm;

import java.util.regex.Pattern;

/**
 * Created by Richard on 2019/12/12.
 * [演算法] Is Palindrome：判斷順寫逆寫是不是一樣
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam"));
    }

    private static boolean isPalindrome(String str) {
        String lowStr = str.toLowerCase();
        Pattern pattern = Pattern.compile("[a-z]");
        StringBuilder sb = new StringBuilder();
        for (String s : lowStr.split("")) {
            if (pattern.matcher(s).matches())
                sb.append(s);
        }
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        return s1.equals(s2);
    }
}
