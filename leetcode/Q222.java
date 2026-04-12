package leetcode;

// Count Complete Tree Nodes (Easy)

public class Q222 {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        int idx = -1;

        Node buildTree(int[] nodes){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        int countNodes(Node root){
            if(root == null){
                return 0;
            }

            int lc = countNodes(root.left);
            int rc = countNodes(root.right);

            return (lc + rc) + 1;
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

        System.out.println(tree.countNodes(root));
    }
}
