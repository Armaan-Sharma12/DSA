
//https://leetcode.com/problems/middle-of-the-linked-list/
public class middleNode {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode middleNode(ListNode head) {
        ListNode length = head;
        int count = 1;
        while(length!=null && length.next!=null){
            length=length.next;
            count++;
        }
        if(count==1){
            return head;
        }
        int mid = count/2;
        ListNode ans = head;
        for (int i = 0; i < mid; i++) {
            ans =  ans.next;
        }
        return ans;
    }
}
