class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int[][] ans = new int[k][2];

        for (int[] arr : points) {
            int dis = arr[0] * arr[0] + arr[1] * arr[1];

            pq.add(new int[] {dis, arr[0], arr[1]});

            if(pq.size() > k) pq.remove();
        }

        for(int i = 0; i < k; i ++) {
            int[] curr = pq.remove();
            ans[i][0] = curr[1];
            ans[i][1] = curr[2];
        }

        return ans;
        

    }
}
