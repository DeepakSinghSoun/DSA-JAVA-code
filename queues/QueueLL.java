package queues;

public class QueueLL {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class Queue {

        ListNode head = null;
        ListNode tail = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void add(int val) {
            ListNode newNode = new ListNode(val);

            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int front = head.val;

            head = head.next;

            if (head == null) {
                tail = null;
            }

            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return head.val;
        }

        public void printQueue() {
            ListNode temp = head;

            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        q.printQueue();

        System.out.println("Removed: " + q.remove());

        q.printQueue();

        System.out.println("Peek: " + q.peek());
    }
}