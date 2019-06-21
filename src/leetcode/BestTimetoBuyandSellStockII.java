package leetcode;

/**
 * Created by zihao on 2019/6/21.
 * <p>
 * 122. Best Time to Buy and Sell Stock II
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * <p>
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 * <p>
 * Example 1:
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * <p>
 * Example 2:
 * Input: [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
 * engaging multiple transactions at the same time. You must sell before buying again.
 * <p>
 * Example 3:
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimetoBuyandSellStockII {
    public static void main(String[] args) {
        int[] input1 = {7, 1, 5, 3, 6, 4};
        //System.out.println("output1: " + getMyResult(input1));

        int[] input2 = {1, 2, 3, 4, 5};
        System.out.println("output2: " + getMyResult(input2));

        int[] input3 = {7, 6, 4, 3, 1};
        //System.out.println("output3: " + getMyResult(input3));
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock II.
     * Memory Usage: 37 MB, less than 80.02% of Java online submissions for Best Time to Buy and Sell Stock II.
     */
    private static int getMyResult(int[] prices) {
        int result = 0;
        int len = prices.length;
        for (int i = 0; i < len; i++) {
            if (i + 1 < len) {
                if (prices[i + 1] > prices[i]) {
                    result += prices[i + 1] - prices[i];
                }
            }
        }
        return result;
    }

    private static int getBetterResult(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) if (prices[i] > prices[i - 1]) res += prices[i] - prices[i - 1];
        return res;
    }
}