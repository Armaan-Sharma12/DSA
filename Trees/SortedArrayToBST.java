
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

public class SortedArrayToBST {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;
        return insert(nums,0, nums.length-1 );
    }
    public TreeNode insert(int[] arr, int start, int end){
        if (start > end) {
            return null;
        }
        int mid = start + (end-start)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = insert(arr,start,mid-1);
        node.right = insert(arr,mid+1,end);
        return node;
    }

}
