class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<Integer>();

        for (int n : nums) {
            numSet.add(n);
        }

        int longest = 1;

        for (int n : numSet) {
            int curr = 0;
            while (numSet.contains(n + curr)) {
                curr++;
            }

            longest = Math.max(longest, curr);
        }

        return longest;        
    }
}
