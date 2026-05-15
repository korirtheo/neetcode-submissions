class Solution {
    int ans = 0;
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        boolean[][] visited = new boolean[r][c];

        for (int i = 0; i < r; i ++) {
            for (int j = 0; j < c; j ++){
                if(!visited[i][j] && grid[i][j] == '1') {
                    dfs(grid, visited, i, j);
                    ans ++;
                }
            }
        }

        return ans;
        
    }

    public void dfs (char[][] grid, boolean[][] visited, int i, int j) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0 ||
            visited[i][j] == true || grid[i][j] == '0') return;

            visited[i][j] = true;
            dfs(grid, visited, i + 1, j);
            dfs(grid, visited, i - 1, j);
            dfs(grid, visited, i, j + 1);
            dfs(grid, visited, i, j - 1);
       
    }
}
