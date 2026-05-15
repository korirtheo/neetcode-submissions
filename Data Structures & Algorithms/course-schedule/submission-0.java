class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] rec = new boolean[numCourses];

        for (int i = 0 ; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
        }

        for (int i = 0; i < graph.size(); i ++) {      
                if( dfs(graph, visited, rec, i)) return false;
        }

        return true;

    }

    public boolean dfs(List<List<Integer>> graph, boolean [] visited, boolean[] rec, int i) {


        if (rec[i]) return true;
        if (visited[i]) return false;

        rec[i] = true;
        visited[i] = true;

        List<Integer> neigh = graph.get(i);

        for (int n : neigh) {
            if (dfs(graph, visited, rec, n)) return true;
        }

        rec[i] = false;

        return false;
    }
}
