package leetcode;

// Maximum Subarray (Medium)

public class Q53 {

    public static int maxSubarraySum(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, -8, 7, -1, 2, 3 };

        System.out.println(maxSubarraySum(nums));
    }
}