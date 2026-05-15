class Solution {
    public List<List<Integer>> ans;

    public void recurse(int[] nums, int target, List<Integer> curr,int sum, int i) {

        if (i == nums.length) {
            return;
        }
        if (sum == target) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(sum > target) {
            return;
        }

        recurse(nums, target, curr, sum, i + 1);

        curr.add(nums[i]);

        recurse(nums, target, curr, sum + nums[i], i);

        curr.remove(curr.size() - 1);

    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ans = new ArrayList<>();

        recurse(nums, target, new ArrayList<Integer>(), 0, 0);

        return ans;
        
    }
}
