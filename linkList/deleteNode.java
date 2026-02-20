package linkList;

import java.util.LinkedList;

/*
 * Delete N Nodes After M Nodes of a Linked
 * List We have a linked list and two integers M and N.
 * Traverse the linked list such that youre tain M nodes then delete next N
 * nodes,
 * continue the same till end of the linked list . Difficulty Level: Rookie.
 * 
 * Sample Input 1:
 * M = 2 N = 2
 * LL: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8
 * Sample Output 1: 1 -> 2 -> 5 -> 6
 * 
 * Sample Input 2:
 * M = 3 N = 2
 * LL: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10
 * Sample Output 2: 1 -> 2 -> 3 -> 6 -> 7 -> 8
 */

public class deleteNode {

    public public static void main(String[] args) {
        int m = 2, n = 2;

        LinkedList<Integer> LL = new LinkedList<>();
        LL.addFirst(8);
        LL.addFirst(7);
        LL.addFirst(6);
        LL.addFirst(5);
        LL.addFirst(4);
        LL.addFirst(3);
        LL.addFirst(2);
        LL.addFirst(1);

        System.out.print(LL);
    }
}