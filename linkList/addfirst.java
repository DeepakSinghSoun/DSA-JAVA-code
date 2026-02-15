package linkList;

public class addFirst {

    // create the Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // create the Head and tail
    public Node head;
    public Node tail;

    // create the add fist list function
    public void addFirstList(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // create the print function
    public void printlist() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        addFirst list = new addFirst();
        list.addFirstList(4);
        list.addFirstList(3);
        list.addFirstList(2);
        list.addFirstList(1);

        list.printlist();
    }
}