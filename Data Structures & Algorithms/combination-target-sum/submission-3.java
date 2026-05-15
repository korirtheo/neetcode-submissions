class Solution {
    List<List<Integer>> ans;

    public void rec(int[] nums, int target, List<Integer> cand, int curr, int ind) {

        if(curr > target) {
            return;
        }

        if(curr == target) {
            ans.add(new ArrayList<>(cand));
            return;
        }

        if(ind >= nums.length) {
            return;
        }

        rec(nums, target, cand, curr, ind + 1);

        cand.add(nums[ind]);

        rec(nums, target, cand, curr + nums[ind], ind);

        cand.remove(cand.size() - 1);

    }


    public List<List<Integer>> combinationSum(int[] nums, int target) {

        ans = new ArrayList<List<Integer>>();

        rec(nums, target, new ArrayList<Integer>(), 0, 0);

        return ans;
        
    }
}
