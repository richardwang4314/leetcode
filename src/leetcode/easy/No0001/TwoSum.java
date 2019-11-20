package leetcode.easy.No0001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zihao on 2019/11/19.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        //System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j] && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
    //Approach 3: One-pass Hash Table
    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
