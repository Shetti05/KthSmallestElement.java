public class CountWords {
    public static void main(String[] args) {
        String text = "Java programming is powerful";

        String[] words = text.split(" ");

        System.out.println("Word Count: " + words.length);
    }
}