class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = -1;
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][columns - 1]) {
                row = i;
                break;
                
            }
        }

        if (row == -1) {
            return false;
        }

        int[] toBe = matrix[row];

        int l = 0;
        int r = columns - 1;

        while (l <= r) {
            
            int m = (l + r)/2;
            System.out.println(m);
            if (toBe[m] > target) {
                r = m - 1;
            }
            else if (toBe[m] < target) {
                l = m + 1;
            }
            else if (toBe[m] == target) {
                return true;
            }
        }

        return false;




        
    }
}
