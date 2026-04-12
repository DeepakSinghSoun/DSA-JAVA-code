package binarytree;

public class LowestCommonAncestor1 {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lCA(Node root, int n1, int n2) {
        if (root == null || root.val == n1 || root.val == n2) {
            return root;
        }

        Node leftlca = lCA(root.left, n1, n2);
        Node rightlca = lCA(root.right, n1, n2);

        if (rightlca == null) {
            return leftlca;
        }

        if (leftlca == null) {
            return rightlca;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;

        System.out.println(lCA(root, n1, n2).val);
    }
}