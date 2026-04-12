package leetcode;

// Sum of Left Leaves (Easy)

public class Q404 {

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

        int sumOfLeftLeaves(Node root){
            if(root == null){
                return 0;
            }

            int sum = 0;

            if (root.left != null && root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }

            return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }

    public static void main(String[] args) {

        int[] nodes = {
            3,
            9, -1, -1,
            20,
            15, -1, -1,
            7, -1, -1
        };

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println(tree.sumOfLeftLeaves(root));
    }
}