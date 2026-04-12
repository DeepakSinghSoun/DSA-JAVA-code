package leetcode;

import java.util.*;

// Median of Two Sorted Arrays (head)

public class Q4 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        System.out.println(findMedian(nums1, nums2));
    }

    public static double findMedian(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];

        int index = 0;
        index = appendArray(merged, nums1, index);
        appendArray(merged, nums2, index);

        Arrays.sort(merged);

        return calculateMedian(merged);
    }

    public static int appendArray(int[] target, int[] source, int index) {
        for (int num : source) {
            target[index++] = num;
        }
        return index;
    }

    public static double calculateMedian(int[] arr) {
        int len = arr.length;

        if (len % 2 == 0) {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        } else {
            return arr[len / 2];
        }
    }
}