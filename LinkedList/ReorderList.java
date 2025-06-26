
import java.util.ArrayList;
//https://leetcode.com/problems/reorder-list/description/
public class ReorderList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalfHead = slow.next;
        slow.next = null;
        ListNode reversedSecondHalf = reverseList(secondHalfHead);
        ListNode firstHalfPointer = head;
        ListNode secondHalfPointer = reversedSecondHalf;
        while (secondHalfPointer != null) {
            ListNode temp1 = firstHalfPointer.next;
            ListNode temp2 = secondHalfPointer.next;
            firstHalfPointer.next = secondHalfPointer;
            secondHalfPointer.next = temp1;
            firstHalfPointer = temp1;
            secondHalfPointer = temp2;
        }
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
