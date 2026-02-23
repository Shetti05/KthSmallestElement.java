import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static char findChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) == 1)
                return c;
        }

        return '_';
    }

    public static void main(String[] args) {
        System.out.println(findChar("swiss"));
    }
}