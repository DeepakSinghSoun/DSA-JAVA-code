package leetcode;

// Longest Palindrome (Easy)

public class Q409 {

    public static int longestPalindrome(String s) {
        int[] freq = new int[52];
        int count = 0;
        boolean hasOdd = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                freq[ch - 'A' + 26]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 == 0) {
                count += freq[i];
            } else {
                count += freq[i] - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            count += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abccccdd";

        System.out.println(longestPalindrome(s));
    }
}