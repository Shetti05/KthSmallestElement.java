import java.util.*;

public class KthSmallestMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < matrix.length; i++) {
            pq.add(new int[]{matrix[i][0], i, 0});
        }

        int val = 0;
        for (int i = 0; i < k; i++) {
            int[] curr = pq.poll();
            val = curr[0];
            int r = curr[1], c = curr[2];

            if (c + 1 < matrix.length) {
                pq.add(new int[]{matrix[r][c+1], r, c+1});
            }
        }
        return val;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(matrix, 8));
    }
}