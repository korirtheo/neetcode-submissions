class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int mins = 0;
        int freshcount = 0;

        Queue<int[]> rotten = new LinkedList<>();

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int i = 0; i < r; i ++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 2) {
                    rotten.add(new int[]{i, j});
                }
                else if(grid[i][j] == 1) {
                    freshcount++;
                }
            }
        }

        if (freshcount == 0) {
            return 0;
        }

        while (!rotten.isEmpty()) {
            boolean rot = false;
            
        int size = rotten.size();
        for (int y = 0; y < size; y ++) {

            int[] current = rotten.poll();
            int i = current[0];
            int j = current[1];

            for(int[] x : directions) {
                int in = x[0] + i;
                int jn = x[1] + j;

                if(in >= 0 && in < grid.length && jn >= 0 &&
                    jn < grid[0].length && grid[in][jn] == 1) {
                        rot = true;
                        grid[in][jn] = 2;
                        rotten.add(new int[] {in, jn});
                        freshcount--;
                }   
            }
            
        }

        if(rot) mins++;

        }

        return freshcount == 0 ? mins : -1;


        
    }
}
