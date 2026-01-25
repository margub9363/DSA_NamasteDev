package binaryTree.preorderTraversal;

import java.util.ArrayList;
import java.util.List;

/*
Input: root = [1,null,2,3]
Output: [1,2,3]
 */
public class Example1 {

    static List<Integer> result = new ArrayList<>();

    public static List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return result;
    }

    private static void preorder(TreeNode node) {
        if (node == null) return;

        result.add(node.val);      // Root
        preorder(node.left);       // Left
        preorder(node.right);      // Right
    }

    public static void main(String[] args) {

        // Example tree: [1,null,2,3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(preorderTraversal(root));
    }
}
