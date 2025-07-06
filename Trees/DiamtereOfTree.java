package com.Tree;
//https://leetcode.com/problems/diameter-of-binary-tree/description/
public class DiamtereOfTree {
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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    public int height(TreeNode root){
        if(root == null)  return 0;
        int left = height(root.left);
        int right = height(root.right);
        int dia =left+right+1;
        diameter = Math.max(diameter,dia);
        return Math.max(left,right)+1;
    }
}
