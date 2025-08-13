

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKSortedLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for(ListNode node:lists){
            while(node!=null){
                list.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(list);
        ListNode head = new ListNode(0);
        ListNode curr = head;
        for(int i:list){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return head.next;
    }

}
