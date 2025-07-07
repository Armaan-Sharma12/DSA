

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public class FlattenBTLinkedList {
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
    public void flatten(TreeNode root) {
        if(root == null) return ;
        if(root.left !=null){
            TreeNode leftChild = root.left;
            TreeNode temp = leftChild;
            while(temp.right != null){
                temp = temp.right;
            }
            temp.right = root.right;
            root.right = leftChild;
            root.left = null;
        }
        flatten(root.right);

    }
}
