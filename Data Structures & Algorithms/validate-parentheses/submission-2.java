class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(mapping.containsKey(c)){
                if(!stack.isEmpty() && mapping.get(c).equals(stack.peek())){
                    stack.pop();
                } else {
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
