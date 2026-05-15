class Solution {

    List<List<Integer>> ans;
    public void rec(int[] nums, List<Integer> curr, int target, int index) {
        if (target < 0) return;

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            // Skip duplicates at the same recursion level
            if (i > index && nums[i] == nums[i - 1]) continue;

            // Stop early if the current number exceeds the remaining target
            if (nums[i] > target) break;

            // Choose the current number
            curr.add(nums[i]);
            rec(nums, curr, target - nums[i], i + 1); // Move to the next index
            curr.remove(curr.size() - 1); // Backtrack
        }

    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        rec(candidates, new ArrayList<Integer>(), target, 0);
        return ans;
      
    }
}
