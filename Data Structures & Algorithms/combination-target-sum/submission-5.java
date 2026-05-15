class Solution {
    public List<List<Integer>> ans;

    public void rec(int[] nums, int target, List<Integer> curr, int sum, int ind) {
        if(ind >= nums.length) {
            return;
        }
        if(sum > target) {
            return;
        }
        if(sum == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[ind]);
        rec(nums, target, curr, sum + nums[ind], ind);

        curr.remove(curr.size() - 1);

        rec(nums, target, curr, sum, ind + 1);        
        

    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        ans = new ArrayList<List<Integer>>();

        rec(nums, target, new ArrayList<>(), 0, 0);        

        return ans;
        
    }
}
