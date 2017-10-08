package com.github.xudong.leetcode.linkedlist.reorder;

import com.github.xudong.leetcode.linkedlist.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode slow = head;
        ListNode fast  = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        boolean isEvent = fast == null;
        ListNode p1 = head;
        ListNode p2;
        if(isEvent){
            p2 = slow;
        }else{
            p2 = slow.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(p1 != null && p2 != null){
            cur.next = p1;
            cur = cur.next;
            p1 = p1.next;

            cur.next = p2;
            cur=cur.next;
            p2 = p2.next;
        }

        if(p1 != null){
            cur.next = p1;
            p1.next = null;
        }
        head = dummy.next;
    }
}
