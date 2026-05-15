class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (String c : tokens) {
            //System.out.println(c);
            switch (c) {
                
                case "+" : stack.push(stack.pop() + stack.pop());break;
                case "-" : stack.push(- stack.pop() + stack.pop());break;
                case "*" : stack.push(stack.pop() * stack.pop());break;
                case "/" : 
                    int a = stack.pop(); 
                    int b = stack.pop();
                    stack.push(b/a);
                    break;
                default : stack.push(Integer.parseInt(c));System.out.println(stack.peek());break;
            }
        }
        return stack.pop();       
    }
}
