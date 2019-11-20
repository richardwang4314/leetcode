package leetcode.easy;

/**
 * Created by Richard on 2019/6/11.
 * <p>
 * 136. Single Number
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 * <p>
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] e1 = {2, 2, 1};
        int[] e2 = {4, 1, 2, 1, 2};

        int result1 = getMyResult(e1);
        int result2 = getMyResult(e2);
        System.out.println("output1: " + result1);
        System.out.println("output2: " + result2);
    }

    private static int getMyResult(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSingle = true;
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                if (nums[i] == nums[j]) {
                    isSingle = false;
                    break;
                }
                isSingle = true;
            }
            if (isSingle)
                return nums[i];
        }
        return 0;
    }

    private static int getBetterResult(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
