package leetcode;

import java.util.Arrays;

/**
 * Created by Richard on 2019/6/13.
 * <p>
 * 283. Move Zeroes
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * <p>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] input1 = {0, 1, 0, 3, 12};
        int[] input2 = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        //System.out.println("output1: " + Arrays.toString(getMyResult(input1)));
        System.out.println("output2: " + Arrays.toString(getMyResult(input2)));
    }

    /**
     * Runtime: 14 ms, faster than 10.66% of Java online submissions for Move Zeroes.
     * Memory Usage: 38.8 MB, less than 79.46% of Java online submissions for Move Zeroes.
     */
    private static int[] getMyResult(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 == nums.length) {
                break;
            }
            if (nums[i] == 0 && nums[i + 1] != 0) {
                if (i + 1 < nums.length) {
                    nums[i] = nums[i + 1];
                    nums[i + 1] = 0;
                }
            } else if (nums[i] == 0 && nums[i + 1] == 0) {
                int x = 2;
                while (i + x < nums.length && nums[i + x] == 0) {
                    x++;
                }
                if (i + x >= nums.length)
                    break;
                nums[i] = nums[i + x];
                nums[i + x] = 0;
            }
        }
        return nums;
    }
}
