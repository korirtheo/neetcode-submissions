class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        int totals = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
                prefix[i] = nums[i-1] * prefix[i-1];
                	System.out.println(prefix[i]);


        }

        int[] output = new int[nums.length];
        output[nums.length-1] = prefix[nums.length - 1]; 
        totals = 1;


        System.out.println("output below");
        for (int i = nums.length - 2; i >= 0; i --) {
            totals *= nums[i+1];
                output[i] = prefix[i] * totals;
                System.out.println(output[i]);
        }


        return output;


        
    }
}  
