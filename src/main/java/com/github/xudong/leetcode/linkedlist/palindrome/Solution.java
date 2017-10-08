package com.github.xudong.leetcode.linkedlist.palindrome;

import com.github.xudong.leetcode.linkedlist.ListNode;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;

        boolean isEven = false;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        final ListNode middle = slow;
        isEven = fast == null;

        ListNode p1 = head;
        ListNode p2;
        if(isEven){
            p2 = reverse(middle);
        }else{
            p2 = reverse(middle.next);
        }

        while (p1 != null && p2 != null && p1.val == p2.val) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2 == null;

    }

    private static ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }

        return prev;
    }
}
