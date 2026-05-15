class Solution {
    int max = 0;


    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        boolean[][] visited = new boolean [r][c];

        for(int i = 0; i < r; i ++) {
            for (int j = 0; j < c ; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    int curr = dfs(grid, visited, i, j);  
                    max = Math.max(max, curr);                  
                }
            }
        }

        return max;


        
    }

    public int dfs(int[][] grid, boolean[][] visited, int r, int c) {
        if (r >= grid.length || c >= grid[0].length || r < 0 || c < 0 ||
            visited[r][c] || grid[r][c] == 0) {
                return 0;
            } 

        visited[r][c] = true;
        
        return 1 + dfs(grid, visited, r + 1, c) +
        dfs(grid, visited, r - 1, c) +
        dfs(grid, visited, r, c + 1) +
        dfs(grid, visited, r, c - 1);


    }
}
