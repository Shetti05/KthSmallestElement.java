public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int rev = 0, temp = x;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return temp == rev;
    }
}