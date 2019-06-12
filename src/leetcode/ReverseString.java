package leetcode;

import java.util.Arrays;

/**
 * Created by Richard on 2019/5/31.
 * <p>
 * 344. Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * You may assume all the characters consist of printable ascii characters.
 * <p>
 * Example 1:
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * <p>
 * Example 2:
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 */
public class ReverseString {
    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        System.out.println("output: " + Arrays.toString(reverseString(s2)));
    }

    private static char[] reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char x = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = x;
        }
        return s;
    }
}
