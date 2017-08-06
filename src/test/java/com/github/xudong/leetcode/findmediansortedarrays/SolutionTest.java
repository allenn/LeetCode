package com.github.xudong.leetcode.findmediansortedarrays;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void testFindMedianSortedArrays_OddNumsElm() throws Exception {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(nums1, nums2);
        Assert.assertThat(result,is(2.0));
    }


    @Test
    public void testFindMedianSortedArrays_venNumsElm() throws Exception {
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};

        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(nums1, nums2);
        Assert.assertThat(result,is(2.5));
    }

}