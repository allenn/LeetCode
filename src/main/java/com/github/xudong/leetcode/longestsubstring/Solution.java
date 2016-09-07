package com.github.xudong.leetcode.longestsubstring;

/**
 * Created by allen on 16/2/14.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int maxLength = 0;
        int curLen = 0;
        for(int j = 0;j< s.length(); j++){
            char c = s.charAt(j);
            int repeatIdx = s.substring(j - curLen, j).indexOf(c);
            if(repeatIdx == -1){
                curLen ++;
            }else{
                curLen = curLen - repeatIdx;
            }
            maxLength = maxLength < curLen ? curLen : maxLength;

        }

        return maxLength;
    }
}
