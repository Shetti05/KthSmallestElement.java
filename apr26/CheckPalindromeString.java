public class CheckPalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev));
    }
}