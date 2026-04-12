package leetcode;

// Remove Duplicates from Sorted List (easy)

public class Q83 {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode head;
    public static ListNode tail;

    public static void addNode(int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void printNode() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void RemoveDuplicate() {
        ListNode temp = head;

        while (temp != null && temp.next != null) {

            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        addNode(1);
        addNode(1);
        addNode(1);
        addNode(3);
        addNode(3);

        printNode();

        RemoveDuplicate();
        printNode();
    }
}