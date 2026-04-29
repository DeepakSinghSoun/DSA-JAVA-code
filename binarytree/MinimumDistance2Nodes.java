package binarytree;

public class MinimumDistance2Nodes {
    static class Node {
        int val;
        Node left;
        Node right;

        Node (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2){
        if (root == null || root.val == n1 || root.val == n2) {
            return root;
        }

        Node leftlac = lca(root.left, n1, n2);
        Node rightlac = lca(root.right, n1, n2);

        if(leftlac == null){
            return rightlac;
        }
        
        if(rightlac == null){
            return leftlac;
        }

        return root;
    }

    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.val == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist+1;
        }else {
            return leftDist+1;
        }
    }

    public static int distance(Node root, int n1, int n2){
        Node LCA = lca(root, n1, n2);

        int dist1 = lcaDist(LCA, n1);
        int dist2 = lcaDist(LCA, n2);

        return dist1 + dist2;
    }

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;

        System.out.println(distance(root, n1, n2));
    }
}