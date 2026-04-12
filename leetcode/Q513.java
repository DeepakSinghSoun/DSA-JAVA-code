package leetcode;

// Find Bottom Left Tree Value (Medium)

public class Q513 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class Result {
        int maxDepth;
        int value;

        Result(int maxDepth, int value) {
            this.maxDepth = maxDepth;
            this.value = value;
        }
    }

    public static void findLeft(TreeNode node, int depth, Result res) {
        if (node == null) {
            return;
        }

        if (depth > res.maxDepth) {
            res.maxDepth = depth;
            res.value = node.val;
        }

        findLeft(node.left, depth + 1, res);
        findLeft(node.right, depth + 1, res);
    }

    public static int findBottomLeftValue(TreeNode root) {
        Result res = new Result(-1, 0);
        findLeft(root, 0, res);
        return res.value;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(findBottomLeftValue(root));
    }
}