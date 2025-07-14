
public class SegmentTree {
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;
    public SegmentTree(int[] arr){
        this.root = constructTree(arr,0,arr.length -1);
    };
    private Node constructTree(int[] arr, int start, int end){
        if(start==end){
            //leaf node
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }
        //Create nodes
        Node node = new Node(start, end);
        int mid  = (start+end)/2;
        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str+"Interval : ["+node.left.startInterval+"-"+node.left.endInterval+"]"+ " and data : "+node.left.data + " =>";
        } else{
            str = str+"no left child";
        }

        //for current node
        str = str+"Interval : ["+node.startInterval+"-"+node.endInterval+"]"+ " and data : "+node.data + " <=";

        if (node.right != null) {
            str = str+"Interval : ["+node.right.startInterval+"-"+node.right.endInterval+"]"+ " and data : "+node.right.data + " =>";
        } else{
            str = str+"no right child";
        }

        System.out.println(str);

        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }
    }

    public int query(int start, int end){
        return this.query(this.root,start,end);
    }
    private int query(Node node, int start, int end){
        if(node.startInterval>=start && node.endInterval<=end){
            //completely inside
            return node.data;
        }
        else if(node.startInterval>end || node.endInterval<start){
            //completely outside
            return 0;
        }
        else{
            return this.query(node.left,start,end) +  query(node.right,start,end);
        }
    }
    public void update(int index, int value){
        this.root.data = update(index,value,this.root);
    }
    private int update(int index, int value, Node node){
        if(index>=node.startInterval &&  index<=node.endInterval){
            if(index == node.startInterval && index ==  node.endInterval){
                node.data = value;
                return node.data;
            } else{
                int leftAns = update(index,value, node.left);
                int rightAns = update(index,value,node.right);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
