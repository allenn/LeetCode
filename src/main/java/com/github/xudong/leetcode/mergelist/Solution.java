package com.github.xudong.leetcode.mergelist;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public static Comparator<ListNode> listNodeComparator = new Comparator<ListNode>(){

        @Override
        public int compare(ListNode l1, ListNode l2) {
            return (l1.val - l2.val);
        }
    };

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        Queue<ListNode> priorityQueue = new PriorityQueue<>(2, listNodeComparator);
        if(l1 != null) {
            priorityQueue.add(l1);
        }
        if(l2 != null) {
            priorityQueue.add(l2);
        }

        ListNode startNode = new ListNode(0);
        ListNode current = null;
        while(priorityQueue.peek() != null){
            // 第一个节点
            if(current == null){
                current = priorityQueue.poll();
                startNode.next = current;
            }else{
                current.next = priorityQueue.poll();
                current = current.next;
            }
            if(current.next != null) {
                priorityQueue.add(current.next);
            }
        }
        return startNode.next;
    }
}

    class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }
