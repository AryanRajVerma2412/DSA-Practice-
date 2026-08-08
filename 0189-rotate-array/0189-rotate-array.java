class Solution {
    public void reverse(int[]nums,int i,int j){
      while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
      }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        // 5 4 3 2 1
        reverse(nums,0,k-1);
        // 4 5 3 2 1 
        reverse(nums,k,n-1);
        // 4 5 1 2 3 
        // 1 2 3 4 5
        // 5 4 3 2 1
        // 4 5 3 2 1
        
    }

}
