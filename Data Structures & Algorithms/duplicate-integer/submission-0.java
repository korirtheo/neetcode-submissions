class Solution {
    public boolean hasDuplicate(int[] nums) {

	        Set<Integer> x = new HashSet<Integer> ();
	        
	        for (int n : nums) {
	        	if (!x.contains(n)) {
	        		x.add(n);
	        	}
	        	else {
	        		return true;
	        	}
	        }
	        
	        return false;
    }

}
