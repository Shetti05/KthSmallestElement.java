import java.util.*;

public class TopologicalSortDFS {
    static void dfs(int v, boolean[] visited, Stack<Integer> stack, List<List<Integer>> adj) {
        visited[v] = true;
        for (int n : adj.get(v)) {
            if (!visited[n]) dfs(n, visited, stack, adj);
        }
        stack.push(v);
    }

    public static void topoSort(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) dfs(i, visited, stack, adj);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}