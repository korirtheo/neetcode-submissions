class Solution {
    int isl;

    public void rec(char[][] grid, boolean[][] visited, int i, int j) {
        if(i >= grid.length || j >= grid[0].length ) return;
        if(i < 0 || j < 0) return;
        if(visited[i][j]) return;
        if(grid[i][j] == '0') return;


        visited[i][j] = true;
        rec(grid, visited, i + 1, j);
        rec(grid, visited, i -1, j);
        rec(grid, visited, i, j + 1);
        rec(grid, visited, i, j - 1);

    }


    public int numIslands(char[][] grid) {
        isl = 0;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    isl++;
                    rec(grid, visited, i, j);
                }
            }
        }

        return isl;
        
    }
}
