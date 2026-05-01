public class SimpleEncryption {
    public static void main(String[] args) {
        String text = "hello";
        String enc = "";
        for(char c: text.toCharArray()) enc += (char)(c+2);
        System.out.println(enc);
    }
}