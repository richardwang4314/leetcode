package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created on 2019/6/28.
 * <p>
 * 202. Happy Number
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example:
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */
public class HappyNumber {
    public static void main(String[] args) {
        boolean input1 = getMyResult(19);
        System.out.println("output1: " + input1);
    }

    /**
     * Runtime: 3 ms, faster than 10.53% of Java online submissions for Happy Number.
     * Memory Usage: 34.6 MB, less than 5.01% of Java online submissions for Happy Number.
     */
    private static boolean getMyResult(int n) {
        List<Integer> list = new ArrayList<>();
        while (String.valueOf(n).length() >= 1) {
            String str = String.valueOf(n);
            int len = str.length();
            int result = 0;
            for (int i = len; i > 0; i--) {
                int a = Integer.valueOf(str.substring(len - i, len - i + 1));
                result += Math.pow(a, 2);
            }
            n = result;
            if (list.contains(result))
                return false;
            list.add(result);
            if (n == 1)
                break;
        }
        return true;
    }

    private static boolean getBetterResult(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            if (n == 1) {
                return true;
            }
            set.add(n);
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        }
        return false;
    }
}
