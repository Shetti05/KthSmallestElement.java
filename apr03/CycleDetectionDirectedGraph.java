import java.util.*;

class CycleDetectionDirectedGraph {
    static boolean dfs(int node, boolean[] visited, boolean[] stack, List<List<Integer>> adj) {
        if (stack[node]) return true;
        if (visited[node]) return false;

        visited[node] = true;
        stack[node] = true;

        for (int nei : adj.get(node)) {
            if (dfs(nei, visited, stack, adj)) return true;
        }

        stack[node] = false;
        return false;
    }

    public static boolean hasCycle(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        boolean[] stack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (dfs(i, visited, stack, adj)) return true;
        }
        return false;
    }
}