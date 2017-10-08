package com.github.xudong.leetcode.linkedlist.reverkgroupnodes;

import com.github.xudong.leetcode.linkedlist.ListNode;
import org.junit.Test;

import java.lang.annotation.Target;

public class SolutionTest {
    @Test
    public void testReverseKGroup(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;

        Solution s = new Solution();
       ListNode result =  s.reverseKGroup(n1, 3);
       System.out.println(result);
    }
}
