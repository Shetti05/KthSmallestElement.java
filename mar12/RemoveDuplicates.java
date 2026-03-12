import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        HashSet<Character> set = new HashSet<>();

        for(char c : str.toCharArray()) {
            set.add(c);
        }

        for(char c : set) {
            System.out.print(c);
        }
    }
}