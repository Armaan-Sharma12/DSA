
//https://leetcode.com/problems/sum-root-to-leaf-numbers/
public class SumNumbersIfromLeaf {
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
    public int sumNumbers(TreeNode root){
         return helper(root,0);
    }
    private int helper(TreeNode root, int sum){
        if(root==null) return 0;
        sum = sum*10+root.val;
        if(root.left==null && root.right==null) return sum;
        return helper(root.left,sum) + helper(root.right,sum);
    }
}
