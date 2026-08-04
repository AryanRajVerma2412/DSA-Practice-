class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans = 0;
        int i=0;
        int j=n-1;
        while(i<j){
            int len = j-i;
            int high = (height[i]>height[j])? height[j] : height[i];
            int area = len*high;
            ans = Math.max(area,ans);
            if(height[i]>height[j]) j--;
            else i++;
        }
        return ans;
    }
}