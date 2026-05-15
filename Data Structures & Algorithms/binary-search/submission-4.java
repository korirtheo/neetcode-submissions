class Solution {


    public int search(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) {
            return 0;
        }

        int l = 0, r = nums.length -1,range=nums.length,c = 0;
        while(l <=r) {
            c = (r + l) / 2;
            if (nums[c] < target) {
                l = c+1;
             }
            else if (nums[c] > target) {
                r = c - 1;
            }
            else {
                return c;
            }
        }

        return -1;
        
    }
}
