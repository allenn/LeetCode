package com.github.xudong.leetcode.longestsubstring;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by allen on 16/2/15.
 */
public class SolutionTest {
    @Test
    public void testLengthOfLongestSubstring(){
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("dvdf");
        Assert.assertThat(result, is(3));
    }

    @Test
    public void testLengthOfLongestSubstring_onlyOne(){
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("d");
        Assert.assertThat(result, is(1));
    }

    @Test
    public void testLengthOfLongestSubstring_onlyOneLetter(){
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("ddddd");
        Assert.assertThat(result, is(1));
    }
}
