package linkList;

public class addlast {

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

    public void addLastList(int data) {
        Node newNode = new Node(data);
        if (tell == null) {
            head = tell = newNode;
            return;
        }

        tell.next = newNode;
        tell = newNode;
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
        addlast list = new addlast();
        list.addLastList(1);
        list.addLastList(2);
        list.addLastList(3);
        list.addLastList(4);
        list.addLastList(5);

        list.printlist();
    }
}
