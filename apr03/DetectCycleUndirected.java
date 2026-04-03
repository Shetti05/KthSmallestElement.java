import java.util.*;

class DetectCycleUndirected {
    static boolean dfs(int node, int parent, boolean[] vis, List<List<Integer>> adj) {
        vis[node] = true;

        for (int nei : adj.get(node)) {
            if (!vis[nei]) {
                if (dfs(nei, node, vis, adj)) return true;
            } else if (nei != parent) return true;
        }
        return false;
    }
}