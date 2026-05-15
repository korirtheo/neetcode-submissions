class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int ln = temperatures.length;
        int[] ans = new int[ln];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 1; i < ln; i ++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()] ) {
                    ans[stack.peek()] =  i - stack.pop() ;
            }
            stack.push(i);           
        }

        return ans;
        
    }
}
