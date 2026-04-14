public class ReverseWords {
    public static String reverse(String str) {
        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--) {
            res.append(words[i]).append(" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Java is fun"));
    }
}