class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int ln = nums.length;
        for (int i = 0; i < ln ; i ++) {

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int oneSum = nums[i];
            int l = i + 1, r = ln - 1;
            while (l < r) {
                int threeSum = nums[l] + nums[r] + oneSum;
                if (threeSum == 0) {
                    res.add(Arrays.asList(oneSum, nums[l], nums[r]));
                    l += 1;
                    while (nums[l] == nums[l-1] && l < r) l++;
                    while (r < ln - 2 && nums[r] == nums[r + 1] && l < r) r--;
                }
                else if (threeSum > 0){
                    r--;
                }
                else {
                    l++;
                }
            } 
        }
        return res;        
    }
}
