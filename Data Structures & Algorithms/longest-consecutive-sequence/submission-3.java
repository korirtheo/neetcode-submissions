class Solution {
    public int longestConsecutive(int[] nums) {

                int result = 1;

        if(nums.length == 0) {
            return 0;
        }


                    if (nums.length < 10000) {
                Arrays.sort(nums); // Sort the array
                int current = 0; // Counter for the current consecutive sequence
                for (int i = 1; i < nums.length; i++) {
                    // Check for unique elements
                    if (nums[i] != nums[i - 1]) {
                        // Check if the current number is consecutive
                        if (nums[i] - nums[i - 1] == 1) {
                            current++; // Increment the current sequence length
                        } else {
                            // Update the result if the current sequence is longer
                            if (current + 1 > result) {
                                result = current + 1;
                            }
                            current = 0; // Reset current counter
                        }
                    }
                }
                // Final check for the last sequence
                if (current + 1 > result) {
                    result = current + 1;
                }
            } else {

        Set<Integer> numSet = new HashSet<Integer>();

        for (int n : nums) {
            numSet.add(n);
        }



        for (int n : numSet) {
            int curr = 0;
            
            if (numSet.contains(n - 1)) {continue;}

            while (numSet.contains(n + curr)) {
                curr++;
            }

            result = Math.max(result, curr);
        }
            }

        return result;        
    }
}
