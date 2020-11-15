package leetcode.easy.No0326;

import java.util.Arrays;

/**
 * Created by Richard on 2019/11/20.
 */
public class PowerOfThree {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPowerOfThree(n));
    }

    private static boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        while (true) {
            if (n == 1) {
                return true;
            }
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
    }
}
