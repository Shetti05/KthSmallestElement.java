public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String rev = "";
        for(char c : str.toCharArray()) {
            rev = c + rev;
        }
        System.out.println(rev);
    }
}