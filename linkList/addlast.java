package linkList;

public class addLast {

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

    public void addLastList(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printlist() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        addLast list = new addLast();
        list.addLastList(1);
        list.addLastList(2);
        list.addLastList(3);
        list.addLastList(4);
        list.addLastList(5);

        list.printlist();
    }
}
