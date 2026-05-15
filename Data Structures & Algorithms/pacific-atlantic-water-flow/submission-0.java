class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List < List < Integer >> pacificAtlantic(int[][] heights) {

        int r = heights.length;
        int c = heights[0].length;

        int[][] directions = {{1,0},{-1, 0},{0,1},{0, -1}};

        boolean[][] pacific = new boolean[r][c];
        boolean[][] atlantic = new boolean[r][c];


        for (int i = 0; i < c; i ++) {
            dfs(heights, pacific, 0, i, directions);
            dfs(heights, atlantic, r-1, i, directions);
        }

        for (int i = 0; i < r; i ++) {
            dfs(heights, pacific, i, 0, directions);
            dfs(heights, atlantic, i, c - 1, directions);
        }

        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i,j));
                }
            }
        }

        return ans;
    }

    public void dfs(int[][] heights, boolean[][] connected, int x, int y, int[][] directions) {

        connected[x][y] = true;

            for (int[] d : directions) {
                int ni = x + d[0];
                int ny = y + d[1];
                if (ni >= 0 && ni <= heights.length - 1 && ny >= 0 && ny <= heights[0].length - 1 && connected[ni][ny] == false) {
                    if (heights[ni][ny] >= heights[x][y]) {                
                        dfs(heights, connected, ni, ny, directions);
                    }
                }
            }

    }
}