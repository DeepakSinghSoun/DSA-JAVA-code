package binarytree;

public class DiameterTree {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        int idx = -1;

        Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        int hight(Node root){
            if (root == null) {
                return 0;
            }

            int lh = hight(root.left);
            int rh = hight(root.right);
            return Math.max(lh,rh)+1;
        }

        int diameter(Node root){
            if(root == null){
                return 0;
            }

            int ld = diameter(root.left);
            int lh = hight(root.left); 

            int rd = diameter(root.right);
            int rh = hight(root.right);

            int self = lh + rh + 1;

            return Math.max(self, Math.max(ld, rd));
        }
    }

    public static void main(String[] args){
        int[] nodes = {
                1, 2, 4, -1, -1,
                5, -1, -1,
                3, -1, 6, -1, -1
        };

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println(tree.diameter(root));
    }
}