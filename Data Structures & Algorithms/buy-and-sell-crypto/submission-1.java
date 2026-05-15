class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        // int l = 0, r = 1;

        // while (r < prices.length) {
        //     if (prices[r] < prices[l]) {
        //         l = r;
        //     }
        //     else {
        //         int profit = prices[r] - prices[l];
        //         maxProfit = Math.max(maxProfit, profit);
        //     }

        //     r++;
        // }
        int min = Integer.MAX_VALUE;

        for(int x : prices) {
            min = Math.min(min, x);
            maxProfit = Math.max(x-min, maxProfit);
        }

        return maxProfit;
        
    }
}
