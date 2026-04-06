package binarytree;

import java.util.*;

public class DiameterTree2 {
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

        class Info{
            int d;
            int h;

            Info(int d, int h){
                this.d = d;
                this.h = h;
            }
        }

        Info diameter(Node root){
            if(root == null){
                return new Info (0, 0);
            }

            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int self = leftInfo.h + rightInfo.h + 1;

            int d =  Math.max(self, Math.max(leftInfo.d, rightInfo.d));
            int h = Math.max(leftInfo.h, rightInfo.h) + 1;  

            return new Info(d, h);
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

        System.out.println(tree.diameter(root).d);
    }
}