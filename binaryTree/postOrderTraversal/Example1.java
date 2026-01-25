package binaryTree.postOrderTraversal;

import java.util.ArrayList;
import java.util.List;

/*
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [4,6,7,5,2,9,8,3,1]
 */
public class Example1 {

    static List<Integer> result = new ArrayList<>();

    public static List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return result;
    }

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

        System.out.println(postorderTraversal(root));
    }

    private static void postorder(TreeNode node) {
        if (node == null) return;

        postorder(node.left);      // Left
        postorder(node.right);     // Right
        result.add(node.val);      // Root
    }
}