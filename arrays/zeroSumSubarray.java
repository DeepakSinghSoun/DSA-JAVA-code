// Find the length of the longest contiguous subarray with sum = 0.

import java.util.*;

public class zeroSumSubarray {
    public static void main(String[] args) {

        int[] arr = { 1, -1, 3, -3, -4, 4, 2 };
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == 0) {
                    int length = j - i + 1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }

        System.out.println(maxLength);
    }
}
