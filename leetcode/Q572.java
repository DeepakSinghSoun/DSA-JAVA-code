package leetcode;

// Subtree of Another Tree (Easy)

public class Q572 {
    static class TreeNode{
        int val;
        TreeNode left, right;

        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }else if(root == null || subRoot == null || root.val != subRoot.val) {
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }

        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }

        return true;
    }

    static boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root == null){
            return false;
        }

        if(root.val == subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        TreeNode subRoot = new TreeNode(2);
        subRoot.left = new TreeNode(4);
        subRoot.right = new TreeNode(5);

        System.out.println(isSubtree(root, subRoot));
    }
}