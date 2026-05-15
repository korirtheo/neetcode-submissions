class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> matcher = new HashMap<Character, Character>();
        matcher.put('}', '{');
        matcher.put(')', '(');
        matcher.put(']', '[');

        Stack<Character> stack = new Stack<Character>();

        if(s.length() == 1 || matcher.containsKey(s.charAt(0))) {
            return false;
        }

        for(char c: s.toCharArray()) {
            
            if(matcher.containsKey(c)) {
                if(stack.isEmpty()) {
                    return false;
                }

                if(stack.peek() == matcher.get(c)) {
                    
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }

        if(stack.isEmpty()) {
            return true;
        }

        return false;
        
    }
}
 