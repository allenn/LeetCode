package com.github.xudong.leetcode.quicksort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by allen on 16/2/7.
 */
public class SolutionTest {

    @Test
    public void testQuickSort() throws Exception {
        Solution solution = new Solution();
        int[] result = solution.quickSort( new int[]{34,3,53,2,23,7,14,10});

        Assert.assertArrayEquals(new int[]{2,3,7,10,14,23,34,53 },result);
    }
}