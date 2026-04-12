package leetcode;

// Insertion Sort List (Medium)

public class Q147 {
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

    public static void InsertionSort() {
        if (head == null) {
            return;
        }
        ListNode dummy = new ListNode(0);

        while (head != null) {
            ListNode curr = head;
            head = head.next;

            ListNode prev = dummy;

            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;
        }

        head = dummy.next;
    }

    public static void main(String[] args) {
        addNode(5);
        addNode(3);
        addNode(2);
        addNode(4);
        addNode(1);

        printNode();

        InsertionSort();
        printNode();
    }
}