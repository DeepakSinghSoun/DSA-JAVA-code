package leetcode;

// Add Two Numbers (medium)

import java.util.*;

public class Q2 {

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();

        int i = 0;
        int carry = 0;

        while (i < list1.size() || i < list2.size()) {
            int num1 = (i < list1.size()) ? list1.get(i) : 0;
            int num2 = (i < list2.size()) ? list2.get(i) : 0;
            int sum = num1 + num2 + carry;

            result.add(sum % 10);
            carry = sum / 10;

            i++;
        }

        if (carry > 0) {
            result.add(carry);
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(2);
        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(6);
        list2.add(4);

        System.out.println(list1);
        System.out.println(list2);

        System.out.print(addTwoNumbers(list1, list2));
    }
}
