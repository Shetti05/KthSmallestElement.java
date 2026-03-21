import java.util.*;

public class DetectCycleInGraph {
    static boolean dfs(int node, boolean[] visited, boolean[] stack, List<List<Integer>> graph) {
        if (stack[node]) return true;
        if (visited[node]) return false;

        visited[node] = true;
        stack[node] = true;

        for (int nei : graph.get(node)) {
            if (dfs(nei, visited, stack, graph)) return true;
        }

        stack[node] = false;
        return false;
    }
}