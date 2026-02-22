import java.util.*;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);
        }

        for (int i = 1; i < k; i++) {
            pq.poll();
        }

        System.out.println("Kth Smallest: " + pq.peek());
    }
}
