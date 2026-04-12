package leetcode;

// Linked List Cycle II (Medium)

public class Q142 {
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

    public static void createCycle() {
        tail.next = head.next.next;
    }

    public static String detectCycle() {
        if (head == null) {
            return "no cycle";
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        if (!isCycle) {
            return "no cycle";
        }

        slow = head;
        int index = 0;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
            index++;
        }

        return "tail connects to node index " + index;
    }

    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);

        printNode();

        createCycle();
        System.out.println(detectCycle());
    }
}