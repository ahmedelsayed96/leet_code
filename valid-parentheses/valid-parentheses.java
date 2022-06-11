class Solution {
    public boolean isValid(String s) {
             Stack<Character> stack = new Stack<Character>();

        for (char ch : s.toCharArray()) {
            if(stack.isEmpty()){
                stack.add(ch);
                continue;
            }
            char beforeChar = stack.peek();
            if (isReversed(ch)&& ch != reversed(beforeChar)) {
                return false;
            } else if (isReversed(ch) && ch == reversed(beforeChar)) {
                stack.pop();
            } else {
                stack.add(ch);
            }

        }
        return stack.isEmpty();
    }
     boolean isReversed(char ch) {
        switch (ch) {
            case '}':
            case ')':
            case ']':
                return true;

        }

        return false;
    }

     char reversed(char ch) {
        switch (ch) {
            case '{':
                return '}';
            case '(':
                return ')';
            case '[':
                return ']';                

        }

        return '.'; 
    }
}