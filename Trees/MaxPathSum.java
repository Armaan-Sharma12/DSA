
//https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class MaxPathSum {
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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    private int helper(TreeNode node){
        if(node==null) return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        left = Math.max(left,0);
        right = Math.max(right,0);
        int Pathmax = left+right+node.val;
        ans = Math.max(ans,Pathmax);
        return Math.max(left,right)+node.val;
    }
}
