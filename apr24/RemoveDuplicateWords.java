import java.util.*;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String str = "java is easy and java is powerful";
        String[] words = str.split(" ");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(words));

        for(String word : set) {
            System.out.print(word + " ");
        }
    }
}