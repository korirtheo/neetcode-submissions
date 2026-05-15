class Solution {
    public int[][] kClosest(int[][] points, int k) {

        int[][] ans = new int [k][2];
        PriorityQueue<int[]> dis = new PriorityQueue<>(Comparator.comparing(a -> a[0]));

        for (int[] arr : points) {
            int xy = arr[0] * arr[0] + arr[1] * arr[1];
            dis.offer(new int[]{xy,arr[0], arr[1]});
        }

        for (int i = 0; i < k; i ++) {
            int[] point = dis.poll();
            ans[i][0] = point[1];
            ans[i][1] = point[2];
        }
        
        return ans;

    }
}
