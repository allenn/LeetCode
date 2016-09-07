package com.github.xudong.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by allen on 15/12/19.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        Map<Integer, Integer> sumIdxMap = new HashMap<>();
        for(int i = 0; i <=nums.length; i++){
            if(sumIdxMap.containsKey(nums[i])){
                ret[0] = sumIdxMap.get(nums[i])+1;
                ret[1] = i+1;
                break;
            }else {
                sumIdxMap.put(target - nums[i], i);
            }
        }
        return ret;

    }
}
