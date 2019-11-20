package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created on 2019/6/17.
 * <p>
 * 242. Valid Anagram
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * <p>
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * <p>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 */
public class ValidAnagram {
    public static void main(String[] args) {
        String input1_1 = "aa";
        String input1_2 = "aa";
        System.out.println("output1: " + getBetterResult(input1_1, input1_2));

        String input2_1 = "rat";
        String input2_2 = "car";
        //System.out.println("output2: " + getMyResult(input2_1, input2_2));
    }

    /**
     * Runtime: 6 ms, faster than 41.16% of Java online submissions for Valid Anagram.
     * Memory Usage: 36.9 MB, less than 77.20% of Java online submissions for Valid Anagram.
     */
    private static boolean getMyResult(String s, String t) {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    private static boolean getBetterResult(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.merge(ch, 1, Integer::sum);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.merge(ch, -1, Integer::sum);
        }
        return true;
    }
}