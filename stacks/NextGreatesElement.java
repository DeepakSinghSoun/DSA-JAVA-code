package stacks;

import java.util.*;

public class NextGreatesElement {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int[] greatesElement = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                greatesElement[i] = -1;
            } else {
                greatesElement[i] = arr[s.peek()];
            }

            s.push(i);
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i <= greatesElement.length - 1; i++) {
            System.out.print(greatesElement[i] + ", ");
        }
    }
}