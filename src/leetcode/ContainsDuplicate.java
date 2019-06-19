package leetcode;

import java.util.*;

/**
 * Created by zihao on 2019/6/19.
 * <p>
 * 217. Contains Duplicate
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 * <p>
 * Example 2:
 * Input: [1,2,3,4]
 * Output: false
 * <p>
 * Example 3:
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 1};
        System.out.println("output1: " + getMyResult(input1));

        int[] input2 = {1, 2, 3, 4};
        System.out.println("output2: " + getMyResult(input2));
    }

    /**
     * Runtime: 8 ms, faster than 67.03% of Java online submissions for Contains Duplicate.
     * Memory Usage: 42.8 MB, less than 67.76% of Java online submissions for Contains Duplicate.
     */
    private static boolean getMyResult(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        return set.size() != nums.length;
    }

    private static boolean getBetterResult(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums)
            if (!set.add(i))
                return true;
        return false;
    }
}
