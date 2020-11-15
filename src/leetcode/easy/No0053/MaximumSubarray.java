package leetcode.easy.No0053;

/**
 * Created by Richard on 2019/11/18.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(getMax2(nums));
    }

    private static int getMax(int[] nums) {
        //想不出來
        return 0;
    }
    //Kadane's演算法 O(n)
    private static int getMax2(int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    //暴力法 O(n^2)
    public static int getMax3(int[] array) {
        int max = array[0], sum;
        for (int start = 0; start < array.length; ++start) {
            sum = 0;
            for (int i = start; i < array.length; ++i) {
                sum += array[i];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
