class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesis = new Stack<>();
        for (char c: s.toCharArray()){
            if (c=='('||c=='['||c=='{') {
                parenthesis.push(c);
            }else {
                if(parenthesis.isEmpty()){
                    return false;
                }
                char top = parenthesis.peek();
                if (c==')'&&top=='('||c==']'&&top=='['||c=='}'&&top=='{'){
                    parenthesis.pop();
                }else{
                    return false;
                }
            }
        }
        return parenthesis.isEmpty();
  
    }
}