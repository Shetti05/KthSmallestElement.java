import java.util.*;

public class CountDistinctElements {
    public static int countDistinct(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4};
        System.out.println(countDistinct(arr));
    }
}
