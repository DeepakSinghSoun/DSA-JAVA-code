package leetcode;

// Remove Duplicates from Sorted List II (Medium)

public class Q82 {
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

    public static void RemoveDuplicatesNode() {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }
        head = dummy.next;
    }

    public static void main(String[] args) {
        addNode(1);
        addNode(1);
        addNode(3);
        addNode(2);
        addNode(2);
        addNode(4);

        printNode();

        RemoveDuplicatesNode();
        printNode();
    }
}