package queues;

import java.util.*;

public class Revers {
    public static void reversQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void printQueue(Queue<Integer> q) {
        for (int num : q) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        printQueue(q);
        reversQueue(q);
        printQueue(q);
    }
}