

public class AddTwoNumber {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) return null;
        ListNode head = addTwoNumbersHelper(l1,l2,0);
        if(head.next==null) return null;
        return head;
    }
    private ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry) {
        if(l1==null && l2==null && carry==0) return null;
        int sum = carry;
        if(l1!=null) sum+=l1.val;
        if(l2!=null) sum+=l2.val;
        ListNode node = new ListNode(sum%10);
        node.next = addTwoNumbersHelper(l1==null?null:l1.next,l2==null?null:l2.next,sum/10);
        return node;
    }
}
