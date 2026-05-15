class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int max = 0;

        while (l<r) {
            int curr = 0;
            if (heights[l] < heights[r]) {
                curr = (r-l) * heights[l];
                l++;
                max = Math.max(max, curr);

            }

            else {
                curr = (r-l) * heights[r];
                r--;
                max = Math.max(max, curr);
            }
        }

        return max;
    }
}
