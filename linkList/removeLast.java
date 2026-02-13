package linkList;

public class removeLast {
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
    public int size;

    // remove the node in last
    public int removeLastNode() {
        if (size == 0) {
            System.out.print("list is Emtpy");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tell = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tell.data;
        prev.next = null;
        tell = prev;
        size--;
        return val;
    }

    public void addLastNode(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tell = newNode;
            return;
        }

        tell.next = newNode;
        tell = newNode;
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
        removeLast list = new removeLast();

        list.addLastNode(1);
        list.addLastNode(2);
        list.addLastNode(3);
        list.addLastNode(4);
        list.addLastNode(5);

        list.printList();

        list.removeLastNode();
        list.printList();
    }
}
