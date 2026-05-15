class Solution {
    public int findDuplicate(int[] nums) {

        int [] ex = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            
            if(ex[nums[i]] == 0) {
                ex[nums[i]] = nums[i];
            }
            else {
                return nums[i];
            }
        }
        return -1;
        
    }
}
