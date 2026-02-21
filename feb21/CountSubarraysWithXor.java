import java.util.*;

public class CountSubarraysWithXor {
    public static int countSubarrays(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int xor = 0, count = 0;
        map.put(0, 1);

        for (int num : arr) {
            xor ^= num;
            if (map.containsKey(xor ^ target)) {
                count += map.get(xor ^ target);
            }
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}