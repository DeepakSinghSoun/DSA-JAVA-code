package queues;

import java.util.*;

public class DequeCreate {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();

        d.addFirst(10);
        d.addFirst(20);
        d.addFirst(30);
        d.addFirst(40);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
    }
}