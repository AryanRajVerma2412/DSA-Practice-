class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int cs = 0;
        int ss = 0;
        for(int choices: students){
            if(choices==0) cs++;
            else ss++;
        }
        for(int sandwich: sandwiches){
            if(sandwich==0){
                if(cs==0) return ss;
                cs--;
            }else{
                if(ss==0) return cs;
                ss--;
            }
        }
        return 0;
    }
}