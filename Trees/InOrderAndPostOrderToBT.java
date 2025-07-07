

import java.util.Arrays;

public class InOrderAndPostOrderToBT {
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0) return null;
        int rootVal= postorder[postorder.length-1];
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == rootVal){
                index = i;
                break;
            }
        }

        TreeNode node = new TreeNode(rootVal);
        node.left = buildTree(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(postorder,0,index));
        node.right = buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length),Arrays.copyOfRange(postorder,index,postorder.length-1));

        return node;
    }
}
