package linkList;

import java.util.LinkedList;

/*
 * Delete N Nodes After M Nodes of a Linked
 * List We have a linked list and two integers M and N.
 * Traverse the linked list such that youre tain M nodes then delete next N
 * nodes,
 * continue the same till end of the linked list . Difficulty Level: Rookie.
 * 
 * Sample Input 1:
 * M = 2 N = 2
 * LL: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
 * Sample Output 1: 1 -> 2 -> 5 -> 6
 * 
 * Sample Input 2:
 * M = 3 N = 2
 * LL: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
 * Sample Output 2: 1 -> 2 -> 3 -> 6 -> 7 -> 8
 */

public class deleteNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node deleteNAfterM(Node head, int M, int N) {

        Node current = head;

        while (current != null) {
            for (int i = 1; i < M && current != null; i++) {
                current = current.next;
            }

            if (current == null) {
                return head;
            }

            Node temp = current.next;

            for (int i = 0; i < N && temp != null; i++) {
                temp = temp.next;
            }

            current.next = temp;
            current = temp;
        }

        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        int M = 2, N = 2;

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        printList(head);

        head = deleteNAfterM(head, M, N);

        printList(head);
    }
}