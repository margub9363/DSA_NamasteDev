package binaryTree.preorderTraversal;

import java.util.ArrayList;
import java.util.List;

/*
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [1,2,4,5,6,7,3,8,9]
 */
public class Example2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);

        traversal(root);
    }

    private static void traversal(TreeNode root) {
        List<Integer> output= new ArrayList<>();
        process(root, output);
        System.out.println(output);
    }

    private static void process(TreeNode current, List<Integer> output) {
        if (current == null) {
            return;
        }
        output.add(current.val);
        process(current.left,output);
        process(current.right, output);
    }
}
