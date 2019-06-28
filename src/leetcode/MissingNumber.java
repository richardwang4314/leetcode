package leetcode;

import java.util.Arrays;

/**
 * Created by zihao on 2019/6/25.
 * <p>
 * 268. Missing Number
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * Example 1:
 * Input: [3,0,1]
 * Output: 2
 * <p>
 * Example 2:
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * <p>
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] input1 = {1};
        //System.out.println("output1: " + getMyResult(input1));

        int[] input2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("output2: " + getBetterResult(input2));
    }

    /**
     * Runtime: 7 ms, faster than 21.36% of Java online submissions for Missing Number.
     * Memory Usage: 39.2 MB, less than 81.23% of Java online submissions for Missing Number.
     */
    private static int getMyResult(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) return i;
        }
        return nums.length;
    }

    private static int getBetterResult(int[] nums) {
        int len = nums.length;
        int sum = (len) * (len + 1) / 2;
        for (int num : nums) sum -= num;
        return sum;
    }
}
