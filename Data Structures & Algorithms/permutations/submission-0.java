class Solution {
    List<List<Integer>> ans;

    public void recurse(int[] nums, List<Integer> curr, boolean[] picked) {
        if(curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
        }

        for (int i = 0; i < nums.length; i ++) {
            if(!picked[i]) {
                curr.add(nums[i]);
                picked[i] = true;
                recurse(nums, curr, picked);

                //backtrack
                curr.remove(curr.size() - 1);
                picked[i] = false;
            }
        }


    }
    public List<List<Integer>> permute(int[] nums) {

        ans = new ArrayList<>();
        recurse(nums, new ArrayList<Integer>(), new boolean[nums.length]);

        return ans;
        
    }
}
