package leetcode;

// Find Missing and Repeated Values (Easy)

public class Q2965 {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] freq = new int[size + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                freq[val]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        for (int i = 1; i <= size; i++) {
            if (freq[i] == 2) {
                repeated = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }
        return new int[] { repeated, missing };
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 3 }, { 2, 2 } };

        int[] result = findMissingAndRepeatedValues(grid);
        System.out.println("Repeated = " + result[0] + ", Missing = " + result[1]);
    }
}