import java.util.*;

public class DetectCycleDirectedGraph {
    static boolean dfs(int node, List<List<Integer>> graph, boolean[] visited, boolean[] recStack) {
        if (recStack[node]) return true;
        if (visited[node]) return false;

        visited[node] = true;
        recStack[node] = true;

        for (int neighbor : graph.get(node)) {
            if (dfs(neighbor, graph, visited, recStack))
                return true;
        }

        recStack[node] = false;
        return false;
    }

    public static boolean hasCycle(int V, List<List<Integer>> graph) {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (dfs(i, graph, visited, recStack))
                return true;
        }
        return false;
    }
}