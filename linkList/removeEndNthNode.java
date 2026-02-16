package linkList;

public class removeEndNthNode {
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
    public int size = 0;

    public void addFirst(int data) { // add list to First
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printList() { // print the list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthfromEnd(int nth) {
        Node temp = head;
        size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (nth == size) {
            head = head.next;
            return;
        }

        int idx = 1;
        int len = size - nth;
        Node prev = head;
        while (idx < len) {
            prev = prev.next;
            idx++;
        }

        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        removeEndNthNode list = new removeEndNthNode();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.printList();
        list.deleteNthfromEnd(1);
        list.printList();
    }
}