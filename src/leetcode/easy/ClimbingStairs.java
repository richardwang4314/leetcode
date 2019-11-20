package leetcode.easy;

/**
 * Created on 2019/7/8.
 * <p>
 * 70. Climbing Stairs
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Note: Given n will be a positive integer.
 * <p>
 * Example 1:
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * <p>
 * Example 2:
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        int input1 = getBetterResult(9);
        System.out.println("output1: " + input1);
    }

    /**
     * Runtime: 3 ms, faster than 10.53% of Java online submissions for Happy Number.
     * Memory Usage: 34.6 MB, less than 5.01% of Java online submissions for Happy Number.
     */
    private static int getMyResult(int n) {
        if(n<=2)
            return n;
        int a1=1;
        int a2=2;
        for (int i=3;i<=n;i++){
            int c=a2;

        }
        return 0;
    }

    private static int getBetterResult(int n) {
        if(n<=0) return 0;
        int p1 = 1, p2 =1;
        for(int i=2; i<=n; i++) {
            int temp = p1+p2;
            p1 = p2;
            p2 = temp;
        }
        return p2;
    }
}
