
public class RotateLl {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode oldTail = head;
        int length = 1;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            length++;
        }
        int rotations = k%length;
        if(rotations==0) return head;
        ListNode newtail = head;
        for (int i = 0; i <= length-rotations-1 ; i++) {
            newtail = newtail.next;
        }
        ListNode curr = head;
        head = newtail.next;
        newtail.next = null;
        oldTail.next = curr;

        return head;
    }
}
