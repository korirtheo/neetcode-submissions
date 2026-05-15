class MedianFinder {
    private PriorityQueue<Integer> maxHeap; // Max-heap for the smaller half
    private PriorityQueue<Integer> minHeap; // Min-heap for the larger half

    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        // Add to maxHeap first
        maxHeap.offer(num);

        // Ensure maxHeap root is less than minHeap root
        if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            minHeap.offer(maxHeap.poll());
        }

        // Balance the heaps
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek(); // Odd total size, maxHeap has the extra element
        }
        return (maxHeap.peek() + minHeap.peek()) / 2.0; // Even total size
    }
}
