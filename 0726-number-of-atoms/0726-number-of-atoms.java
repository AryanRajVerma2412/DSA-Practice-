class Solution {
    public String countOfAtoms(String formula) {
        int n = formula.length();
        Stack<Map<String,Integer>> st = new Stack<>();

        st.push(new HashMap<>());
        int i = 0;
    while(i<n){
        if(formula.charAt(i)=='('){
            st.push(new HashMap<>());
            i++;
        }else if(formula.charAt(i)==')'){
            Map<String,Integer> top = st.pop();
            i++;
            StringBuilder sb = new StringBuilder();
            while(i<n && Character.isDigit(formula.charAt(i))){
                sb.append(formula.charAt(i));
                i++;
            }
            int multi = sb.length()>0 ? Integer.parseInt(sb.toString()) : 1;
            for(String key : top.keySet()){
                int value = top.get(key);
                top.put(key , value*multi);
            }
            for(String key : top.keySet()){
                st.peek().put(key , st.peek().getOrDefault(key,0)+top.get(key));
            }
        }else{
            StringBuilder ele = new StringBuilder();
            ele.append(formula.charAt(i++));
            while(i<n && Character.isLowerCase(formula.charAt(i))){
                ele.append(formula.charAt(i++));
            }
            StringBuilder sb = new StringBuilder();
            while(i<n && Character.isDigit(formula.charAt(i))){
                sb.append(formula.charAt(i++));   
            }
            int count = sb.length()>0 ? Integer.parseInt(sb.toString()) : 1;
            st.peek().put(ele.toString() ,st.peek().getOrDefault(ele.toString(),0)+count);
        }
    }
    TreeMap<String,Integer> sortedMap = new TreeMap<>(st.peek());
    StringBuilder result = new StringBuilder();
    for(String key : sortedMap.keySet()){
        result.append(key);
        int count = sortedMap.get(key);
        if(count>1){result.append(count);}
    }
    return result.toString();
    }
}