

import java.util.ArrayList;
import java.util.List;

public class SortedListToBST {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public TreeNode sortedListToBST(ListNode head) {
      ArrayList<Integer> list = new ArrayList<>();
      while(head!=null){
        list.add(head.val);
        head= head.next;
      }
      return helper(list,0,list.size()-1);
    }
    private TreeNode helper(List<Integer> list, int start, int end){
      if(start>end) return null;
      int mid = start + (end-start)/2;
      TreeNode node = new TreeNode(list.get(mid));
      node.left = helper(list,start,mid-1);
      node.right = helper(list,mid+1,end);
      return node;
    }
}
