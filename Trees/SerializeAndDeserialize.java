package com.Tree;
//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SerializeAndDeserialize {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root,list);
        return list.toString();
    }
    private void helper(TreeNode root, List<String> list){
        if(root == null){
            list.add("null");
            return;
        }
        list.add(String.valueOf(root.val));
        helper(root.left,list);
        helper(root.right,list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        data = data.substring(1, data.length() - 1);
        List<String> list = Arrays.stream(data.split(",")).map(String::trim).collect(Collectors.toList());
        return helper2(list);
    }
    private TreeNode helper2(List<String> list){
        String val = list.remove(0);
        if(val.equals("null")) return null;
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helper2(list);
        node.right = helper2(list);
        return node;
    }


}
