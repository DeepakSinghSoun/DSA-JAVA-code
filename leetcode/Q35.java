package leetcode;

// Search Insert Position (Easy)

public class Q35 {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;

        System.out.print("Index : " + searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int firstIndex = 0;
        int lestIndex = nums.length - 1;

        while (firstIndex <= lestIndex) {
            int midIndex = firstIndex + (lestIndex - firstIndex) / 2;

            if (nums[midIndex] == target) {
                return midIndex;
            } else if (nums[midIndex] < target) {
                firstIndex = midIndex + 1;
            } else {
                lestIndex = midIndex - 1;
            }
        }
        return firstIndex;
    }
}
