import java.util.*;

class DetectCycleGraph {
    static boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                if (dfs(neigh, node, visited, adj)) return true;
            } else if (neigh != parent) return true;
        }
        return false;
    }
}