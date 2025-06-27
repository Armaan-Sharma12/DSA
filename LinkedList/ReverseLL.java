package com.LinkedList;
//https://leetcode.com/problems/reverse-linked-list

public class ReverseLL {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode future = head.next;
        while (future != null) {
            curr.next = prev;
            prev = curr;
            curr = future;
            future = future.next;
        }
        curr.next = prev;
        return curr;
    }
    //https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode present = head;
        ListNode prev = null;

        for (int i = 0;present!=null && i < left-1; i++) {
            prev = present;
            present = present.next;
        }
        ListNode last = prev;
        ListNode newEnd = present;
        ListNode next = present.next;
        for (int i = 0; present!=null && i < right-left+1; i++) {
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null) {
               next = next.next;
            }
        }
        if(last!=null) {
            last.next = prev;
        } else{
            head = prev;
        }
        newEnd.next = present;
        return head;
    }
}
