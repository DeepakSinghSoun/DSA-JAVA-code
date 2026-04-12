package leetcode;

// Length of Last Word (Easy)

public class Q58 {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.print(findlenght(s));
    }

    public static int findlenght(String s) {
        String str = s.trim();

        /*
         * int lastSpace = str.lastIndexOf(' ');
         * return str.length() - lastSpace - 1;
         */

        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}
