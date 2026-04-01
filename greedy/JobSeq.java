package greedy;

import java.util.*;

public class JobSeq {
    public static void main(String[] args) {
        int[][] jobInfo = { { 3, 35 },
                { 1, 30 },
                { 1, 25 },
                { 2, 20 },
                { 2, 15 } };

        Arrays.sort(jobInfo, (a, b) -> b[1] - a[1]);

        ArrayList<Integer> ans = new ArrayList<>();
        int time = 0;
        int count = 0;
        for (int i = 0; i < jobInfo.length; i++) {
            if (jobInfo[i][0] < count) {
                time++;
                ans.add(i);
            }
            count++;
        }

        System.out.println(time);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
