package leetcode;

// Single Number (Easy)

public class Q136 {

    public static int singleNumber(int[] nums) {
        int single = 0;

        for (int i = 0; i < nums.length; i++) {
            single ^= nums[i];
        }

        return single;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 3, 8, 3, 8 };
        System.out.println(singleNumber(nums));
    }
}