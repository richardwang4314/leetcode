package leetcode;

import java.util.Arrays;

/**
 * Created by zihao on 2019/6/26.
 * <p>
 * 350. Intersection of Two Arrays II
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * <p>
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * <p>
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * <p>
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
        int[] input1_1 = {1, 2, 2, 1};
        int[] input1_2 = {2, 2};
        System.out.println("output1: " + Arrays.toString(getMyResult(input1_1, input1_2)));

        int[] input2_1 = {4, 9, 5};
        int[] input2_2 = {9, 4, 9, 8, 4};
        //System.out.println("output2: " + Arrays.toString(getMyResult(input2_1, input2_2)));
    }

    /**
     * 寫不出來
     */
    private static int[] getMyResult(int[] nums1, int[] nums2) {
        return nums1;
    }

    private static int[] getBetterResult(int[] nums1, int[] nums2) {
        if (nums1.length == 0)
            return nums1;
        if (nums2.length == 0)
            return nums2;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums2[j] < nums1[i])
                j++;
            else if (nums1[i] == nums2[j]) {
                nums1[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
