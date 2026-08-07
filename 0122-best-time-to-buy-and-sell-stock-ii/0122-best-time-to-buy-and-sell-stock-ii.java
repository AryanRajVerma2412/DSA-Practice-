class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        for(int i=0, j=1; j < n; i++, j++){
            int profit = prices[j]-prices[i];
            if(profit>0){
                ans += profit;
            }else{
                continue;
            }
        }
        return ans;
    }
}