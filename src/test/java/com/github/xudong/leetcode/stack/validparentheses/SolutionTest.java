package com.github.xudong.leetcode.stack.validparentheses;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void isValid() throws Exception {
        String testStr = "()[]{}";
        Solution s = new Solution();
        boolean result = s.isValid(testStr);
        Assert.assertThat(result, is(true));
    }

}