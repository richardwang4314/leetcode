package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Richard on 2019/6/12.
 *
 * 412. Fizz Buzz
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 *
 * Example:
 * n = 15,
 *
 * Return:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 */
public class FizzBuzz {
    public static void main(String[] args) {
        List<String> result1 = getMyResult(15);
        System.out.println("output1: " + result1);
    }

    /**
     * Runtime: 1 ms, faster than 100.00% of Java online submissions for Fizz Buzz.
     * Memory Usage: 37 MB, less than 99.96% of Java online submissions for Fizz Buzz.
     */
    private static List<String> getMyResult(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    result.add("FizzBuzz");
                } else {
                    result.add("Fizz");
                }
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
