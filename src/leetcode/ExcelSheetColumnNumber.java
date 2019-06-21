package leetcode;

/**
 * Created by zihao on 2019/6/21.
 * <p>
 * 171. Excel Sheet Column Number
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * <p>
 * Example 1:
 * Input: "A"
 * Output: 1
 * <p>
 * Example 2:
 * Input: "AB"
 * Output: 28
 * <p>
 * Example 3:
 * Input: "ZY"
 * Output: 701
 */
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String input1 = "A";
        //System.out.println("output1: " + getMyResult(input1));

        String input2 = "AB";
        System.out.println("output2: " + getMyResult(input2));

        String input3 = "ZY";
        System.out.println("output3: " + getMyResult(input3));
    }

    /**
     * Runtime: 1 ms, faster than 99.92% of Java online submissions for Excel Sheet Column Number.
     * Memory Usage: 36 MB, less than 78.94% of Java online submissions for Excel Sheet Column Number.
     */
    private static int getMyResult(String s) {
        int result = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            result += (s.charAt(i) - 'A' + 1) * Math.pow(26, (len - i - 1));
        }
        return result;
    }

    private static int getBetterResult(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
