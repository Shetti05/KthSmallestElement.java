import java.util.HashSet;

public class FindDuplicate {
    public static int find(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) return num;
        }
        return -1;
    }
}