class Solution {
    public int[] twoSum(int[] nums, int target) {

    int[]  res = {0,0};

    Map<Integer, Integer> items = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; i++) {
        if(items.containsKey(target - nums[i])) {
            res[0] =  items.get(target - nums[i]);
            res[1] = i;
            return res;
        }

        else {
            items.put(nums[i], i);
        }
    }

    return res;   
        
    }
}
