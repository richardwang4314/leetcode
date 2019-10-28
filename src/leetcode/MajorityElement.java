package leetcode;

import java.util.*;

/**
 * Created on 2019/6/13.
 * <p>
 * 169. Majority Element
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * <p>
 * Example 1:
 * Input: [3,2,3]
 * Output: 3
 * <p>
 * Example 2:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] input1 = {3, 2, 3};
        int[] input2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("output1: " + getMyResult(input1));
        System.out.println("output2: " + getBetterResult(input2));
    }

    /**
     * Runtime: 12 ms, faster than 35.32% of Java online submissions for Majority Element.
     * Memory Usage: 39.5 MB, less than 99.37% of Java online submissions for Majority Element.
     */
    private static int getMyResult(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.get(n) == null) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }

        for (int m : map.keySet()) {
            if (map.get(m) > nums.length / 2) {
                return m;
            }
        }
        return 0;
    }

    private static int getBetterResult(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}