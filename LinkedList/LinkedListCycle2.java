//Leetcode question
public class LinkedListCycle2 {
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

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
               length = Element(slow);
               break;
            }
        }
        if(length==0) return null;
        ListNode f = head;
        ListNode s = head;
        while(length>0){
            s=s.next;
            length--;
        }
        while(s!=f){
            f=f.next;
            s=s.next;
        }
        return s;
    }
}
