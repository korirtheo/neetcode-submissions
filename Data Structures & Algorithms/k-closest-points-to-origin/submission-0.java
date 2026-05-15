class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        int[][] ans = new int[k][2];

        for (int[] point : points) {
            int dist = point[0] * point[0] + point[1] * point[1];
            minHeap.offer(new int[] {dist, point[0], point[1]});


        }

        while (k > 0) {
            int[] p = minHeap.poll();
            ans[k - 1][0] = p[1];
            ans[k-1][1] = p[2];

            k--;
        }
        return ans;

    }
}
