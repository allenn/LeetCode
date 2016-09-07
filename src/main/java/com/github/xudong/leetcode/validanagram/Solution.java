package com.github.xudong.leetcode.validanagram;

import java.util.Hashtable;

/**
 * Created by allen on 15/12/20.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            Hashtable<Character, Integer> counter = new Hashtable<>();
            for (int i = 0; i < s.length(); i++) {
                char s_ = s.charAt(i);
                char t_ = t.charAt(i);

                Integer sValue = counter.getOrDefault(s_, 0);
                counter.put(s_, sValue + 1);

                Integer tValue = counter.getOrDefault(t_, 0);
                counter.put(t_, tValue - 1);
            }

            for (Integer value : counter.values()) {
                if (value != 0) return false;
            }

            return true;
        }
    }
}
