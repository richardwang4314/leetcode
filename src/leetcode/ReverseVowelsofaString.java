package leetcode;

import java.util.ArrayList;

/**
 * Created by Richard on 2019/6/6.
 * <p>
 * 345. Reverse Vowels of a String
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * <p>
 * Example 1:
 * Input: "hello"
 * Output: "holle"
 * Example 2:
 * Input: "leetcode"
 * Output: "leotcede"
 * <p>
 * Note:
 * The vowels does not include the letter "y".
 */
public class ReverseVowelsofaString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "leetcode";
        System.out.println("output: " + reverseVowels(s2));
    }

    private static String reverseVowels(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String one = s.substring(i, i + 1);
            if (one.equals("a") || one.equals("e") || one.equals("i") || one.equals("o") || one.equals("u")) {
                list.add(i);
            }
        }
        return s;
    }
}
