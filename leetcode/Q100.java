package leetcode;

// Same Tree (Easy)

public class Q100 {
    static class TreeNode {
        int val;
        TreeNode left, right;
    
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }else if(p == null || q == null || p.val != q.val){
            return false;
        }

        if(!isSameTree(p.left, q.left)){
            return false;
        }

        if(!isSameTree(p.right, q.right)){
            return false;
        }

        return true;
    }

    public static void main(String[] args){
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(isSameTree(p, q));
    }
}