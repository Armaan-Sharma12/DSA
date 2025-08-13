package com.Tree;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
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
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return answer;
        List<Integer> list = new ArrayList<>();
        helper(root,targetSum,list);
        return answer;
    }
    private void helper(TreeNode node, int sum,List<Integer> list){
        if(node== null) return;
        list.add(node.val);
        sum = sum-node.val;
        if(node.left==null && node.right==null && sum==0){
            answer.add(new ArrayList<>(list));
        }
        helper(node.left,sum,list);
        helper(node.right,sum,list);
        list.remove(list.size()-1);
    }
}
