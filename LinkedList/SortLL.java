//https://leetcode.com/problems/sort-list/
public class SortLL {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = null;
        }
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return mergeTwoLists(left, right);

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
