package linkList;

public class doublylist {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;

    // adding the new Node in list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removeFist() {
        if (head == null) {
            System.out.print("List is Empty");
            return Integer.MIN_VALUE;
        } else if (head.next == null) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    // print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        doublylist dList = new doublylist();
        dList.addFirst(5);
        dList.addFirst(4);
        dList.addFirst(3);
        dList.addFirst(2);
        dList.addFirst(1);

        dList.printList();
        dList.removeFist();
        dList.printList();
    }
}