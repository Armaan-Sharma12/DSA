

public class Cousins {
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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root,x);
        TreeNode yy = findNode(root,y);
        return((level(root,xx,0) == level(root,yy,0)&& (!sibling(root,xx,yy))));

    }
    public TreeNode findNode(TreeNode node, int x){
        if(node==null) return null;
        if(node.val == x) return node;
        TreeNode left = findNode(node.left, x);
        if(left!=null) return left;
        return findNode(node.right,x);
    }
    public int level(TreeNode node, TreeNode target, int level){
        if(node==null) return -1 ;
        if(node.val==target.val) return level;
        int left = level(node.left,target,level+1);
        if(left!=-1) return left;
        return level(node.right,target,level+1);
    }

    public boolean sibling(TreeNode node, TreeNode first, TreeNode second){
        if(node==null) return false;
        return ((node.left == first && node.right == second) || (node.left == second && node.right == first) || sibling(node.left,first,second) || sibling(node.right,first,second));
    }
}
