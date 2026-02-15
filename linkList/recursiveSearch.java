package linkList;

public class recusiveSearch {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addLastNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int searchRecusive(int key) {
        return helper(head, key);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] agrs) {
        recusiveSearch list = new recusiveSearch();
        list.addLastNode(1);
        list.addLastNode(2);
        list.addLastNode(3);
        list.addLastNode(4);
        list.addLastNode(5);

        list.printList();

        System.out.println(list.searchRecusive(4));
    }
}