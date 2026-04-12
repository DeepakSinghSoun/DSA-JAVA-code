package leetcode;

import java.util.*;

public class Q232 {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void push(int data) {
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

    public static void main(String[] args) {

        Queue q = new Queue();

        q.push(10);
        q.push(20);
        q.push(30);

        q.printQueue();
    }
}