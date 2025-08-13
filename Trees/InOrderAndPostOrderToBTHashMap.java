

import java.util.Arrays;
import java.util.HashMap;

public class InOrderAndPostOrderToBTHashMap {
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
    static int index = 0;
    public TreeNode buildTree(int[] inorder, int[] preorder) {
        if(inorder.length == 0) return null;
        HashMap<Integer,Integer> map = new HashMap<>();

        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);

            }
        return helper(preorder,inorder,0,preorder.length-1,map);

    }

    private TreeNode helper(int[] preorder, int[] inorder, int left, int right, HashMap<Integer, Integer> map) {
        if(left > right) return null;
        int current = preorder[index];
        index++;
        TreeNode node = new TreeNode(current);
        if(left==right) return node;
        int indexInOrder = map.get(current);
        node.left = helper(preorder,inorder,left,indexInOrder-1,map);
        node.right = helper(preorder,inorder,indexInOrder+1,right,map);
        return node;
    }
}
