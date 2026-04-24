public class ReverseWords {
    public static void main(String[] args) {
        String str = "Java is awesome";
        String[] words = str.split(" ");

        for(String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            System.out.print(rev + " ");
        }
    }
}