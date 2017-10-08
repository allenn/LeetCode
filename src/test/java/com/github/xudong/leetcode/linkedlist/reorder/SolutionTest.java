package com.github.xudong.leetcode.linkedlist.reorder;

import com.github.xudong.leetcode.linkedlist.ListNode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void reorderList() throws Exception {


        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
       Solution s = new Solution();
       s.reorderList(n1);
    }

}