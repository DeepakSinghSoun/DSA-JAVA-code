package linkList;

import org.w3c.dom.Node;

public class addMid {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tell;

    public void addFistList(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tell = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // create function to add Mid list
    public void addMidList(int index, int data) {
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;

        while (i < index - 1) {
            i++;
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addMid list = new addMid();

        list.addFistList(5);
        list.addFistList(4);
        list.addFistList(2);
        list.addFistList(1);

        list.printList();

        list.addMidList(2, 3);

        list.printList();
    }
}