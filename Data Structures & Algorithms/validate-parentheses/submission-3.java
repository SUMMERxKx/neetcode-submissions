class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> check = new HashMap<>();
        check.put(')', '(');
        check.put(']', '[');
        check.put('}', '{');

        for(char c: s.toCharArray()){
            if(check.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == check.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
