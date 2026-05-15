class Solution {
    int[] order;
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[numCourses];
        boolean[] rec = new boolean[numCourses];

        for (int i = 0 ; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
        }

        List<Integer>  ans = new ArrayList<>();

        for (int i = 0; i < graph.size(); i ++) {      
                if( dfs(graph, visited, rec, i, ans)) return new int[0];
        }

        //Collections.reverse(ans);

        int[] result = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            result[i] = ans.get(i);
        }

        return result;

    }

    public boolean dfs(List<List<Integer>> graph, boolean [] visited, boolean[] rec, int i, List<Integer> ans) {


        if (rec[i]) return true;
        if (visited[i]) return false;

        rec[i] = true;
        visited[i] = true;

        List<Integer> neigh = graph.get(i);

        for (int n : neigh) {
            if (dfs(graph, visited, rec, n, ans)) return true;
        }

        rec[i] = false;

        ans.add(0,i);

        return false;
    }
}
