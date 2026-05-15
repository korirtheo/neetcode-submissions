class Solution {
    List<List<Integer>> ans;

    public void rec(int[] nums, List<Integer> curr, int index) {

        ans.add(new ArrayList<>(curr));
        
        for(int i = index; i < nums.length; i++) {
            if(i > index && nums[i-1] == nums[i]) continue;

            curr.add(nums[i]);
            rec(nums, curr, i + 1);
            //backtrack
            curr.remove(curr.size() - 1);
        }

    }




    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans = new ArrayList<>();
        Arrays.sort(nums);
        rec(nums, new ArrayList<Integer>(), 0);

        return ans;
        
    }
}
