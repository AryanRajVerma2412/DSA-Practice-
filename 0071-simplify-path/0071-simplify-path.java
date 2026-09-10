class Solution {
    public String simplifyPath(String path) {
        String[] tokens = path.split("/");
        Stack<String> st = new Stack<>();

        for(String token : tokens){

            if(token.equals("") || token.equals(".")) continue;

            if(token.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                    st.push(token);
                }
        }
        if(st.isEmpty()) return "/";
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.insert(0,"/"+st.pop());
        }
        return result.toString();
    }
}