class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int n: stones) {
            maxHeap.add(n);
        }

        while (maxHeap.size() > 1) {
            int a = maxHeap.poll();
            int b = maxHeap.poll();

            if(a > b) maxHeap.offer(a-b); 
            else if(b > a) maxHeap.offer(b-a);
        }

        if(maxHeap.size() == 1) return maxHeap.poll();

        return 0;
        
    }
}
