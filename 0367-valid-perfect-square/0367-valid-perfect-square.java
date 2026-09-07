class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= num / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans == num / ans && num % ans == 0;
    }
}