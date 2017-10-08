package com.github.xudong.leetcode.mergelist;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void mergeTwoLists() throws Exception {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        Solution solution = new Solution();
        ListNode result = solution.mergeTwoLists(l1, l2);
        System.out.println(result);
    }

}