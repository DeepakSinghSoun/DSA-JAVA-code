package leetcode;

// Intersection of Two Arrays (Easy)

import java.util.*;

public class Q349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!arr.contains(nums1[i])) {
                        arr.add(nums1[i]);
                    }
                }
            }
        }

        int[] result = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 1, 2 };

        int[] ans = intersection(nums1, nums2);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}