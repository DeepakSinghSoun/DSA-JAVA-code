package leetcode;

// Delete the Middle Node of a Linked List (Medium)

public class Q2095 {
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

    public static void DeleteNode(ListNode node) {
        if (head == null) {
            return;
        }

        if (head == node) {
            head = head.next;
            return;
        }

        ListNode temp = head;
        while (temp.next != null && temp.next != node) {
            temp = temp.next;
        }

        if (temp.next == node) {
            temp.next = node.next;
        }
    }

    public static void DeleteMidNode() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        DeleteNode(slow);
    }

    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);

        printNode();

        DeleteMidNode();
        printNode();
    }
}