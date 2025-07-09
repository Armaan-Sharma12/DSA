package com.Tree;
//https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/1688091152/
public class KthSmallest {
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
    public int kthSmallest(TreeNode root, int k) {
        return Helper(root,k).val;
    }
    int count=0;
    public TreeNode Helper(TreeNode root, int k) {
        if (root == null) return null;
        TreeNode left = Helper(root.left,k);
        if(left!=null) return left;
        count++;
        if(count==k) return root;
        return Helper(root.right,k);

    }
}
