class Solution {
    List<List<Integer>> ans;

    public void recurse(int[] nums, List<Integer> curr, int i) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        //first exclude elemennt
        recurse (nums, curr, i + 1);

        //now include it
        curr.add(nums[i]);
        recurse (nums, curr, i + 1);

        //backtracking to remove nums[i]
        curr.remove(curr.size() - 1);  

        return;

    }
    public List<List<Integer>> subsets(int[] nums) {
        ans = new ArrayList<List<Integer>>();
        recurse(nums, new ArrayList<Integer>(), 0);
        return ans;
        
    }
}
