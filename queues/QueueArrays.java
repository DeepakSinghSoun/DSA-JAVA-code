package queues;

public class QueueArrays {
    static class Queues {
        int[] arr;
        int size;
        int rear;

        Queues(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queues is Full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }

        public void printQueue() {
            while (!isEmpty()) {
                System.out.println(peek());
                remove();
            }
        }
    }

    public static void main(String[] args) {
        Queues q = new Queues(5);

        q.add(10);
        q.add(20);
        q.add(30);

        q.printQueue();
    }
}