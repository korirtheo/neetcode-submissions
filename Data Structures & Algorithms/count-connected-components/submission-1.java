class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        List<List<Integer>> graph = new ArrayList<>();
        int ans = 0;

        for (int i = 0; i < n; i ++) {
            graph.add(new ArrayList<>());
        }

        for(int[] x : edges) {
            graph.get(x[0]).add(x[1]);
            graph.get(x[1]).add(x[0]);
        }

        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(graph, visited, i);
                ans++;
            }
        }

        return ans;



    }

    public void dfs(List<List<Integer>> graph, boolean[] visited, int i) {
        if (visited[i]) return;
        
        visited[i] = true;


        List<Integer> neighbors = graph.get(i);

        for (int n : neighbors) {
            if(!visited[n]) {
                dfs(graph, visited, n);
            }
        }
    }
}
