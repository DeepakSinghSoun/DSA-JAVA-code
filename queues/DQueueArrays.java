package queues;

public class DQueueArrays {

    static class Queue {
        int[] arr;
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void addQueue(int data) {
            if (isFull()) {
                System.out.println("Queues is Full");
                return;
            }

            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }

        public void printQueue() {
            while (!isEmpty()) {
                System.out.println(peek());
                remove();
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.addQueue(10);
        q.addQueue(20);
        q.addQueue(30);

        System.out.println("remove : " + q.remove());
        q.addQueue(40);

        System.out.println("remove : " + q.remove());
        q.addQueue(50);

        q.printQueue();
    }
}