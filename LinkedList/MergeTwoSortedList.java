
// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                ans.next = list1;
                list1 = list1.next;
            } else{
                ans.next = list2;
                list2 = list2.next;
            }
            ans=ans.next;

        }

        if (list1 != null) {
            ans.next = list1;
        } else {
            ans.next = list2;
        }

        return head.next;
    }
}
