package linkList;

public class zigZag {

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
        System.out.println("null");
    }

    // find the mid in the list
    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // reverse the half of list
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void zigZaglist() {
        if (head == null || head.next == null) {
            return;
        }

        Node mid = getMid(head);

        Node rightHead = reverse(mid.next);
        mid.next = null;

        Node left = head;
        Node right = rightHead;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        zigZag list = new zigZag();
        list.addFirstList(5);
        list.addFirstList(4);
        list.addFirstList(3);
        list.addFirstList(2);
        list.addFirstList(1);

        list.printlist();
        list.zigZaglist();
        list.printlist();

    }
}