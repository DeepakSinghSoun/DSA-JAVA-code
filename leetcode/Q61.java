package leetcode;

// Rotate List (medium)

import java.util.*;

public class Q61 {

    public static LinkedList<Integer> rotateList(LinkedList<Integer> list, int k) {

        int length = list.size();

        k = k % length;

        for (int i = 0; i < k; i++) {
            int last = list.removeLast();
            list.addFirst(last);
        }

        return list;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        int key = 2;

        System.out.println(rotateList(list, key));
    }
}