package com.github.xudong.leetcode.findmediansortedarrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        return findByMegerAndSortArrays(nums1, nums2);
    }

    private double findByMegerAndSortArrays(int[] nums1, int[] nums2){
        int totalLength = nums1.length + nums2.length;
        int[] mergedArrays = new int[totalLength];

        System.arraycopy(nums1, 0, mergedArrays, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArrays, nums1.length, nums2.length);

        Arrays.sort(mergedArrays);

        if(totalLength % 2 == 0){
            return (mergedArrays[totalLength / 2-1] + mergedArrays[totalLength /2]) / 2.0;
        }else{
            return mergedArrays[totalLength / 2];
        }

    }    
}
