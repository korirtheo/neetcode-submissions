class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numSet = new HashSet<>();
        int currLen = 0;

        for (int i = 0; i < nums.length; i ++) {
            numSet.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++) {
            int curr = 1;
            if(numSet.contains(nums[i] - 1)) continue;
            int temp = nums[i];
            while(numSet.contains(temp +1)) {
                curr++;
                temp++;
            }

            if(curr > currLen) currLen = curr;
        }
        
        return currLen;
    }
}
