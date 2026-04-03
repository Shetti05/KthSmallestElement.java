class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int start = 0, max = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPal(s, i, j) && j-i+1 > max) {
                    start = i;
                    max = j-i+1;
                }
            }
        }
        return s.substring(start, start + max);
    }

    static boolean isPal(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }
}