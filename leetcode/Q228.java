package leetcode;

import java.util.*;

// Summary Ranges (Easy)

public class Q228 {

    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 4, 6, 8, 9 };

        System.out.print(findRange(arr));
    }

    public static List<String> findRange(int[] arr) {
        List<String> result = new ArrayList<>();

        if (arr.length == 0)
            return result;

        int start = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[i - 1] + 1) {

                if (start == arr[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + arr[i - 1]);
                }

                start = arr[i];
            }
        }

        if (start == arr[arr.length - 1]) {
            result.add(String.valueOf(start));
        } else {
            result.add(start + "->" + arr[arr.length - 1]);
        }

        return result;
    }
}
