package leetcode;

// Binary Tree Inorder Traversal (Easy)

import java.util.*;

public class Q94 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    class inorderT {

        int idx = -1;

        TreeNode buildTree(int nodes) {
            if (nodes == -1) {
                return null;
            }

            TreeNode newNode = new TreeNode(nodes);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            inorder(root, result);
            return result;
        }

        private void inorder(TreeNode root, List<Integer> result) {

            if (root == null) {
                return;
            }

            inorder(root.left, result);
            result.add(root.val);
            inorder(root.right, result);
        }

        public static void main(String[] args) {

            inorderT tree = new inorderT();

            TreeNode root = tree.buildTree(1);
            root.right = new TreeNode(2);
            root.right.left = new TreeNode(3);

            List<Integer> result = tree.inorderTraversal(root);

            System.out.println(result);
        }
    }
}