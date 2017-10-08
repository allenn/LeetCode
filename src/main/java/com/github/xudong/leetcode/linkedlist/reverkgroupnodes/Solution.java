package com.github.xudong.leetcode.linkedlist.reverkgroupnodes;

import com.github.xudong.leetcode.linkedlist.ListNode;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 0){
            return head;
        }else{
            ListNode preGroupHead = null;
            ListNode groupHead = head;
            ListNode groupEnd = null;

            while(groupHead != null){
                int groupIdx = 0;
                groupEnd = groupHead;
                while(groupIdx < k && groupEnd != null){
                    groupEnd = groupEnd.next;
                    groupIdx++;
                }
                if(groupIdx < k){
                    break;
                }else{
                    int changeLen = k;
                    ListNode modifyTail = groupHead;
                    ListNode newGroupHead = null;
                    while(groupHead != null && changeLen > 0){
                        ListNode next = groupHead.next;
                        groupHead.next = newGroupHead;
                        newGroupHead = groupHead;
                        groupHead = next;
                        changeLen --;
                    }
                    modifyTail.next = groupHead;
                    if(preGroupHead == null){
                        // first group
                        head = newGroupHead;
                    }else{
                        preGroupHead.next = newGroupHead;
                    }
                    preGroupHead = modifyTail;
                }
            }
            return head;
        }
    }
}