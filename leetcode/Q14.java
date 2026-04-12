package leetcode;

// Longest Common Prefix (Easy)

public class Q14 {
    public static void main(String args[]) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(findPrefix(strs));
    }

    public static String findPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder sameStr = new StringBuilder();

        int minLen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }

        for (int j = 0; j < minLen; j++) {
            char current = strs[0].charAt(j);

            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) != current) {
                    return sameStr.toString();
                }
            }

            sameStr.append(current);
        }

        return sameStr.toString();
    }
}
