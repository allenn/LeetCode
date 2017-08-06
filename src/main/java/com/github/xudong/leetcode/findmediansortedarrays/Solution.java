package com.github.xudong.leetcode.findmediansortedarrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        return quickFindMedianSortedArrays(nums1, nums2);
    }

    private double findByMergeAndSortArrays(int[] nums1, int[] nums2){
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

    private double quickFindMedianSortedArrays(int[] nums1, int[] nums2){
        int totalLength =  nums1.length + nums2.length;

        int targetIdx = totalLength / 2;

        if(totalLength % 2 == 0){
            return (findKth(nums1, nums2, targetIdx) +     findKth(nums1, nums2, targetIdx+1)) /2   ;
        }      else{
            return        findKth(nums1, nums2, targetIdx+1);
        }
    }

    private double findKth(int[] nums1, int[] nums2, int k){
        if(nums1.length > nums2.length){
           return findKth(nums2, nums1, k);

        }else if(nums1.length == 0)  {
               return nums2[k-1];
        }else if (k == 1){
            return Math.min(nums1[0], nums2[0]);
        }

        int pa = Math.min(k /2, nums1.length);
        int pb = k - pa;
        if(nums1[pa - 1] < nums2[pb -1]){

            return findKth(Arrays.copyOfRange(nums1,pa ,nums1.length), nums2, k- pa);
        }  else if (nums1[pa- 1] > nums2[pb -1]){
            return   findKth(nums1, Arrays.copyOfRange(nums2,pb ,nums2.length), k- pb);
        }     else {
            return nums1[pa -1];
        }
        
    }
}
