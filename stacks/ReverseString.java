package stacks;

import java.util.*;

public class ReverseString {

    public static String reverse(String str) {
        Stack<Character> ch = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            ch.push(str.charAt(idx));
            idx++;
        }

        StringBuilder strB = new StringBuilder("");

        while (!ch.isEmpty()) {
            char curr = ch.pop();
            strB.append(curr);
        }
        return strB.toString();
    }

    public static void main(String[] args) {
        String str = "deep";
        String result = reverse(str);
        System.out.print(result);
    }
}