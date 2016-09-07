package com.github.xudong.leetcode.reverseint;

/**
 * Created by allen on 15/12/20.
 */
public class Solution {
    public int reverse(int x) {
        if (x == 0) return 0;

        int flag = x > 0 ? 1 : -1;
        x = Math.abs(x);
        double result = (double) 0;

        while (x > 0) {

            int lastNum = x % 10;
            result = result * (double) 10 + (double) lastNum;
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int)result * flag;
    }
}
