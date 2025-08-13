

public class RemoveNthElement {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        int size = 0;
        while(temp!=null && temp.next!=null){
            size++;
            temp = temp.next;
        }
        if (n > size) {
            return head;
        }
        ListNode current = dummy;
        for(int i = 0; i<size-n;i++){
            current = current.next;
        }
        current.next = current.next.next;
        return dummy.next;
    }
}
