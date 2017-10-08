package com.github.xudong.leetcode.linkedlist.palindrome;

import com.github.xudong.leetcode.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void isPalindrome() throws Exception {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        Solution s = new Solution();

        boolean result = s.isPalindrome(n1);
        Assert.assertThat(result, is(false));
    }

}