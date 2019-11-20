package leetcode.easy;

/**
 * Created on 2019/6/14.
 * <p>
 * 13. Roman to Integer
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Example 1:
 * Input: "III"
 * Output: 3
 * <p>
 * Example 2:
 * Input: "IV"
 * Output: 4
 * <p>
 * Example 3:
 * Input: "IX"
 * Output: 9
 * <p>
 * Example 4:
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * <p>
 * Example 5:
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class RomantoInteger {
    public static void main(String[] args) {
        String input1 = "IX";
        String input2 = "MCMXCIV";
        System.out.println("output1: " + getBetterResult(input1));
        //System.out.println("output2: " + getMyResult(input2));
    }

    /**
     * Runtime: 6 ms, faster than 62.38% of Java online submissions for Roman to Integer.
     * Memory Usage: 36.8 MB, less than 99.94% of Java online submissions for Roman to Integer.
     */
    private static int getMyResult(String s) {
        int result = 0;
        while (s.length() > 0) {
            switch (s.substring(0, 1)) {
                case "M":
                    result += 1000;
                    break;
                case "D":
                    result += 500;
                    break;
                case "C":
                    result = result + (s.contains("M") || s.contains("D") ? -100 : 100);
                    break;
                case "L":
                    result += 50;
                    break;
                case "X":
                    result = result + (s.contains("L") || s.contains("C") ? -10 : 10);
                    break;
                case "V":
                    result += 5;
                    break;
                case "I":
                    result = result + (s.contains("V") || s.contains("X") ? -1 : 1);
                    break;
            }
            s = s.substring(1);
        }
        return result;
    }

    private static int getBetterResult(String s) {
        int cache = 0;
        int sum = 0;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                n = 1;
            } else if (c == 'V') {
                n = 5;
            } else if (c == 'X') {
                n = 10;
            } else if (c == 'L') {
                n = 50;
            } else if (c == 'C') {
                n = 100;
            } else if (c == 'D') {
                n = 500;
            } else if (c == 'M') {
                n = 1000;
            }

            sum += n;
            if (n > cache) {
                sum -= cache * 2;
            }

            cache = n;
        }
        return sum;
    }
}
