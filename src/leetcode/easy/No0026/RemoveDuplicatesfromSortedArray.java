package leetcode.easy.No0026;

import java.util.*;

/**
 * Created by Richard on 2019/11/19.
 */
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < set.size(); i++) {
            nums[i] = (Integer) set.toArray()[i];
        }
        return set.size();
    }
    //Approach 1: Two Pointers
    public int removeDuplicates2(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
