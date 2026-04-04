package binarytree;

public class InorderT {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
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

        void inorder(Node root) {
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] nodes = {
                1, 2, 4, -1, -1,
                5, -1, -1,
                3, -1, 6, -1, -1
        };

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println(root.val);

        tree.inorder(root);
    }
}