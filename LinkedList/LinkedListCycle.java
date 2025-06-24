//https://leetcode.com/problems/linked-list-cycle/description/
public class LinkedListCycle {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }

    public int Element(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=slow){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return 0;
        }
        int count = 1;
        slow = slow.next;
        while(slow!=fast){
            slow = slow.next;
            count++;
        }
        return count;
    }
}
