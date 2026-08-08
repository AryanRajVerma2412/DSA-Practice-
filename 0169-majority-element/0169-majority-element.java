class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int n=nums.length;
        int f=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt=1;
                f=nums[i];
            }
            else if(nums[i]==f){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0 ; i<n ; i++){
            if(nums[i]==f){
                cnt1++;
            }
        }
        if(cnt1>(n/2)){
            return f;
        }
        return -1;
    }
}