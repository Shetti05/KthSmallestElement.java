// File: CourseSchedule.java
import java.util.*;

public class CourseSchedule {
    public static boolean canFinish(int n, int[][] prereq) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] p : prereq) adj.get(p[1]).add(p[0]);

        int[] indegree = new int[n];
        for (int[] p : prereq) indegree[p[0]]++;

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            if (indegree[i] == 0) q.add(i);

        int count = 0;
        while (!q.isEmpty()) {
            int cur = q.poll();
            count++;
            for (int nei : adj.get(cur)) {
                if (--indegree[nei] == 0) q.add(nei);
            }
        }
        return count == n;
    }
}