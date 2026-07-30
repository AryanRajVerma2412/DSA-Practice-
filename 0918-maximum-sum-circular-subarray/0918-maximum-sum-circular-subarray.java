class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int total = 0;
       int currmax = 0;
       int currmin = 0;
       int maxsum = nums[0]; 
       int minsum = nums[0]; 

       for(int num: nums){
        currmax = Math.max(num, currmax + num);
        maxsum = Math.max(currmax, maxsum);

        currmin = Math.min(num, currmin + num);
        minsum = Math.min(currmin, minsum);

        total += num;
       }

       if(maxsum < 0) return maxsum;

       return Math.max(maxsum, total - minsum);
    }
}