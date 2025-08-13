

public class CountNode {
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
    int count = 0 ;
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        count = helper(root);
        return count;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        return helper(root.left)+helper(root.right)+1;
    }
}
