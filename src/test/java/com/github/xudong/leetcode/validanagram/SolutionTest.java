package com.github.xudong.leetcode.validanagram;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by allen on 15/12/20.
 */
public class SolutionTest {

    @Test
    public void testIsAnagram() throws Exception {
        Solution solution = new Solution();
        Assert.assertThat(solution.isAnagram("abb","bba"), is(true));
    }
}