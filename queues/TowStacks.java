package queues;

import java.util.*;

public class TowStacks {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return s1.pop();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return s1.peek();
        }

        public void printQueue() {
            while (!isEmpty()) {
                System.out.println(peek());
                remove();
            }
        }
    }

    public void main(String[] args) {

        Queue q = new Queue();

        q.add(10);
        q.add(20);
        q.add(30);

        q.printQueue();
    }
}