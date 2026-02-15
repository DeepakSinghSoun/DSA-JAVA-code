package linkList;

public class iterativeSearch {
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

    public void addFistNode(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int iterativeSearchList(int key) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.data == key) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
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
        iterativeSearch list = new iterativeSearch();
        list.addFistNode(5);
        list.addFistNode(4);
        list.addFistNode(3);
        list.addFistNode(2);
        list.addFistNode(1);

        list.printList();
        System.out.println("Index : " + list.iterativeSearchList(4));
    }
}