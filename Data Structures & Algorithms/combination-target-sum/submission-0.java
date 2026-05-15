class Solution {
    List<List<Integer>> ans;

    public void recurse(int[] nums, List<Integer> cand, int target, int index) {
        if (target == 0) ans.add(new ArrayList<> (cand));

        if (target < 0) return;

        for (int i = index; i < nums.length; i++) {
            cand.add(nums[i]);
            recurse(nums, cand, target - nums[i], i);
            cand.remove(cand.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        ans = new ArrayList<>();
        recurse(nums, new ArrayList<>(), target, 0);

        return ans;

        
    }
}
