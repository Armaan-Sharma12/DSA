
public class RemoveDuplicates {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if (head == null || head.next == null) {
            return head;
        }
        while (node != null && node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

