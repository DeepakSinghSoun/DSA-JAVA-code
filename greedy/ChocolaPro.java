package greedy;

import java.util.*;

public class ChocolaPro {
    public static void main(String[] args) {
        // int n = 4, m = 6;
        Integer[] costVer = { 2, 1, 3, 1, 4 };
        Integer[] costHor = { 4, 1, 2 };

        Arrays.sort(costHor, Comparator.reverseOrder());
        Arrays.sort(costVer, Comparator.reverseOrder());

        int cost = 0;
        int vp = 1, hp = 1, v = 0, h = 0;

        while (v < costVer.length && h < costHor.length) {
            if (costHor[h] > costVer[v]) {
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println(cost);
    }
}