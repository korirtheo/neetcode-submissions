class Solution {
    public int findKthLargest(int[] nums, int k) {

        int keep = nums.length - k  + 1;

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int x: nums) {
            q.offer(x);

            if (q.size() > keep) {
                q.poll();
            }
        }

        return q.poll();


        
    }
}
