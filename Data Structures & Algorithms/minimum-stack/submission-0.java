class MinStack {
    int min;
    public List<Integer> stack;

    public MinStack() {
        stack = new ArrayList<Integer>();
        min = Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {
        stack.add(val); 
        min = Math.min(val, min);      
    }
    
    public void pop() {
        if(stack.size() == 0) {
            return;
        } 
        else {
            int removeIndex = stack.size() - 1;
            int remove = stack.get(removeIndex);
            stack.remove(removeIndex);
                       
            if (remove == min) {
                int minCurr = Integer.MAX_VALUE;
                for (int x : stack) {
                    minCurr = Math.min(x, minCurr);
                }
                min = minCurr;
            }
        }
    }
    
    public int top() {
        int res = stack.get(stack.size() - 1);
        return res;
    }
    
    public int getMin() {
        return this.min;
    }
}
