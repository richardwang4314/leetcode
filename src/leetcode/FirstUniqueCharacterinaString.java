package leetcode;

/**
 * Created by zihao on 2019/6/21.
 * <p>
 * 387. First Unique Character in a String
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * <p>
 * Examples:
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * <p>
 * Note: You may assume the string contain only lowercase letters.
 */

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String input1 = "leetcode";
        System.out.println("output1: " + getMyResult(input1));

        String input2 = "loveleetcode";
        System.out.println("output2: " + getMyResult(input2));
    }

    /**
     * Runtime: 1 ms, faster than 99.92% of Java online submissions for Excel Sheet Column Number.
     */
    private static int getMyResult(String s) {
        //TODO
        for (int i = 1; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                if (i + 1 < s.length() && j + 1 < s.length()) {
                    if (s.substring(i, i + 1).equals(s.substring(j, j + 1))) {
                        continue;
                    }
                }
            }
            return i;
        }
        return -1;
    }

    private static int getBetterResult(String s) {
        int result = 0;

        return result;
    }
}
