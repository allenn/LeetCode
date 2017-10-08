package com.github.xudong.leetcode.longestpalindrome;

public class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return s;
        }else{
            String longest = s.substring(0, 1);
            for(int i = 0; i < s.length(); i++){
                String tmp = expandAroundCentre(s, i, i);
                if(longest.length() < tmp.length()){
                    longest = tmp;
                }

                tmp = expandAroundCentre(s, i, i+1);
                if(longest.length() < tmp.length()){
                    longest = tmp;
                }
            }
            return longest;
        }
    }

    private String expandAroundCentre(String s, int lc, int rc){
        while (lc >= 0 && rc <= s.length() -1 && s.charAt(lc) == s.charAt(rc)){
            lc --;
            rc ++;
        }
        return s.substring(lc +1, rc);
    }
}
