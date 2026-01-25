package binaryTree.preorderTraversal;

import java.util.ArrayList;
import java.util.List;

/*
Input: root = [1,null,2,3]
Output: [1,2,3]
 */
public class Example1 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);


        System.out.println("Pre Order Traversal node-----");
        preOrderTraversal(root);
    }

    private static void preOrderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        traversal(root, ans);
        System.out.println(ans);
    }

    private static void traversal(TreeNode current, List<Integer> ans) {
        if (current == null) {
            return;
        } ans.add(current.val);
        traversal(current.left,ans);
        traversal(current.right,ans);
    }
}
