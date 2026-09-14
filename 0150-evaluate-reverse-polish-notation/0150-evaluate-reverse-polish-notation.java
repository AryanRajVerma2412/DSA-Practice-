class Solution {
    public int operate(int a, int b, String token){
        switch(token){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            default:
                return a/b;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token: tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = st.pop();
                int a = st.pop();
                st.push(operate(a, b, token));
            }else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}