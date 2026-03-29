import java.util.*;

public class KthSmallestInMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] row : matrix) {
            for (int num : row) {
                pq.add(num);
            }
        }

        for (int i = 1; i < k; i++) {
            pq.poll();
        }
        return pq.poll();
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(matrix, 8));
    }
}