package greedy;

import java.util.*;

public class Coins {
    public static void main(String[] args) {
        Integer[] Rupp = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 590;

        Arrays.sort(Rupp, Comparator.reverseOrder());
        ArrayList<Integer> ans = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < Rupp.length; i++) {
            if (Rupp[i] <= amount) {
                while (Rupp[i] <= amount) {
                    count++;
                    ans.add(Rupp[i]);
                    amount = amount - Rupp[i];
                }
            }
        }

        System.out.println(count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}