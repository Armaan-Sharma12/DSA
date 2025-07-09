

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AllPathSum {
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
    int sum = 0;
    public int pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        return helper(root,sum,path);
    }
    private int helper(TreeNode node, int sum, List<Integer> path){
        if(node == null) return 0;
        path.add(node.val);
        int count = 0;
        int s = 0;
        //path I can make
        ListIterator<Integer> it = path.listIterator();
        while(it.hasPrevious()){
            s+=it.previous();
            if(s==sum){
                count++;
            }
        }
        count+=helper(node.left,sum,path)+helper(node.right,sum,path);
        //backtrack
        path.remove(path.size()-1);
        return count;
    }

    public List<List<Integer>> pathSum2(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper2(root,targetSum,path,res);
        return res;
    }
    private void helper2(TreeNode node, int targetSum, List<Integer> path, List<List<Integer>> res){
        if(node == null) return;
        path.add(node.val);
        if(node.left == null && node.right == null && node.val == targetSum){
            res.add(new ArrayList<>(path));
        } else{
            helper2(node.left,targetSum-node.val,path,res);
            helper2(node.right,targetSum-node.val,path,res);
        }
        //backtrack
        path.remove(path.size()-1);
    }
}
