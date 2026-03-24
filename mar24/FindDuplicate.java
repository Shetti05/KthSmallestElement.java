// File: FindDuplicate.java
import java.util.*;

public class FindDuplicate {
    public static int find(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(find(arr));
    }
}