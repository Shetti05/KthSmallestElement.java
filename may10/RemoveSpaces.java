public class RemoveSpaces {
    public static void main(String[] args) {
        String text = "Java Programming Language";

        String result = text.replaceAll(" ", "");

        System.out.println(result);
    }
}