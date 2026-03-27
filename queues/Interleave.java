package queues;

import java.util.*;

public class Interleave {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
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
        interLeave(q);
        printQueue(q);
    }
}