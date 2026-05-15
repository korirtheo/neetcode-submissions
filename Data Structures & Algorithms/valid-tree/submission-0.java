class Solution {
    public boolean validTree(int n, int[][] edges) {
        // A tree must have exactly n-1 edges
        if (edges.length != n - 1) return false;

        // Build the graph as an adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // To check connectedness and cycles
        boolean[] visited = new boolean[n];
        if (dfs(graph, 0, -1, visited)) return false; // Cycle detected

        // Ensure all nodes are visited (graph is connected)
        for (boolean v : visited) {
            if (!v) return false;
        }

        return true;
    }

    private boolean dfs(List<List<Integer>> graph, int node, int parent, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(graph, neighbor, node, visited)) return true;
            } else if (neighbor != parent) {
                // If a visited neighbor is not the parent, it's a cycle
                return true;
            }
        }

        return false;
    }
}
