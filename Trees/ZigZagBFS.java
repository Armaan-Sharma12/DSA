import java.util.*;
//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
public class ZigZagBFS {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) return levels;
        int lev = 0;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            if(lev%2==0) {
                for (int i = 0; i < size; i++) {
                    TreeNode current = queue.pollFirst();
                    level.add(current.val);

                    if (current.left != null) {
                        queue.addLast(current.left);
                    }
                    if (current.right != null) {
                        queue.addLast(current.right);
                    }
                }
            } else{
                for(int i = 0; i <size; i++){

                    TreeNode current = queue.pollLast();
                    level.add(current.val);

                    if(current.right != null) {
                        queue.addFirst(current.right);
                    }
                    if(current.left != null) {
                        queue.addFirst(current.left);
                    }
                }
            }
            lev++;
            levels.add(level);
        }
        return levels;
    }
}
