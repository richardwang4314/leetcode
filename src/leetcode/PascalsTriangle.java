package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zihao on 2019/6/27.
 * <p>
 * 118. Pascal's Triangle
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * <p>
 * Example:
 * Input: 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        int input1 = 5;
        System.out.println("output1: " + getMyResult(input1));
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
     * Memory Usage: 34 MB, less than 5.19% of Java online submissions for Pascal's Triangle.
     */
    private static List<List<Integer>> getMyResult(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int row = 1;
        while (row <= numRows) {
            int num = 1;
            List<Integer> list = new ArrayList<>();
            list.add(0, 1);
            while (num < row - 1 && row > 2) {
                List<Integer> p = result.get(row - 2);
                list.add(num, p.get(num - 1) + p.get(num));
                num++;
            }
            list.add(row - 1, 1);
            result.add(list);
            row++;
        }
        return result;
    }

    private static List<List<Integer>> getBetterResult(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int a = result.get(i - 1).get(j - 1);
                    int b = result.get(i - 1).get(j);
                    list.add(a + b);
                }
            }
            result.add(list);
        }
        return result;
    }
}
