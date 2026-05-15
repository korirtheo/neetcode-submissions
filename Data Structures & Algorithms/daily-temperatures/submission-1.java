class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        int[] stack = new int[n]; // Stack to store indices of temperatures
        int top = -1; // Pointer to the top of the stack
        
        for (int i = 0; i < n; i++) {
            // While there's a day in the stack with a lower temperature than the current day
            while (top >= 0 && temperatures[i] > temperatures[stack[top]]) {
                int index = stack[top--]; // Pop the index from the stack
                result[index] = i - index; // Calculate days until a warmer temperature
            }
            stack[++top] = i; // Push the current day's index onto the stack
        }
        
        return result;
        
    }
}
