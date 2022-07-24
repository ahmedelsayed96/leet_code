class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(String ch:tokens){
            
            if(!ch.equals("+") && !ch.equals("-") && !ch.equals("*") && !ch.equals("/")){
                stack.push(Integer.parseInt(ch));
                continue;
            }else {
                int num1 =stack.pop();
                int num2 =stack.pop();
                int res =0;;
                switch(ch){
                    case "+":
                        res=num2+num1;
                        break;
                    case "-":
                        res=num2-num1;
                        break;
                    case "*":
                        res=num2*num1;
                        break;
                    case "/":
                        res=num2/num1;
                        break;
                
                }
                stack.push(res);
            }
            
        }
        return stack.pop();
    }
}