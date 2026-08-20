class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length!=pattern.length()) return false;
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String st = words[i];
            if(map.containsKey(ch) && !map.get(ch).equals(st)){
                return false;
            }
            if(!map.containsKey(ch) && map.containsValue(st)){
                return false;
            }
            map.put(ch, st);
        }
        return true;
    }
}