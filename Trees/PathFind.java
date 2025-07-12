package com.Tree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PathFind {
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
// root to leaf node
    public boolean hasPath(TreeNode root, Integer [] arr){
        if(root == null || arr.length == 0) return false;
        if(root.val == arr[0]){
            arr[0] = -1;
            return hasPath(root.left,arr) || hasPath(root.right,arr);
        }
        return false;
    }

    // from anywhere
    public boolean hasPathPath(TreeNode root, int [] arr){
        if(root == null || arr.length == 0) return false;
        return helper(root,arr,0);
    }
    private boolean helper(TreeNode node, int [] arr, int index){
        if(node ==  null) return false;
        if(index>=arr.length || node.val != arr[index]) return false;
        if(node.left ==  null && node.right  == null && index == arr.length-1) return true;
        return helper(node.left,arr,index+1) || helper(node.right,arr,index+1);
    }
}
