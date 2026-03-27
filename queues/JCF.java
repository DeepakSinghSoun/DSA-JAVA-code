package queues;

import java.util.*;

public class JCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}