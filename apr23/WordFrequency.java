import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "java is great and java is powerful";
        Map<String,Integer> map = new HashMap<>();

        for(String word : text.split(" ")) {
            map.put(word, map.getOrDefault(word,0)+1);
        }
        System.out.println(map);
    }
}