package linkList;

public class doublyReverselist {

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

    public void reverseDL() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        doublyReverselist dList = new doublyReverselist();
        dList.addFirst(5);
        dList.addFirst(4);
        dList.addFirst(3);
        dList.addFirst(2);
        dList.addFirst(1);

        dList.printList();
        dList.reverseDL();
        dList.printList();
    }
}