

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        Scanner scanner = new Scanner(System.in);
//        tree.populate(scanner);
//        tree.PrettyDisplay();

//        BST bst = new BST();
//        int[] nums = {1,2,3,4,5,6,7,8,9,10};
//        bst.populatedSorted(nums);
//        bst.display();
//        System.out.println();
//        bst.PreorderTraversal();
//        System.out.println();
//        bst.InorderTraversal();
//        System.out.println();
//        bst.PostorderTraversal();

//        AVLTree tree = new AVLTree();
//        for (int i = 0; i <1000;i++) {
//            tree.insert(i);
//        }
//
//        System.out.println(tree.height());
//        int[] arr = {3,8,6,7,-2,-8,4,9};
//        SegmentTree tree = new SegmentTree(arr);
//        tree.display();
//
//        System.out.println(tree.query(1,6) );

        BFS b = new BFS();
        Scanner scanner = new Scanner(System.in);
        b.populate(scanner);
        b.display();
    }
}
