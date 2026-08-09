class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int currentend = 0;
        int reach = 0;
        for(int i=0; i<nums.length-1; i++){
            reach = Math.max(reach, i + nums[i]);
            if(i == currentend){
                jump++;
                currentend = reach;
            }
        }
        return jump;
    }
}