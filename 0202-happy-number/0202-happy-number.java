class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> map = new HashSet<>();
        while(n!=1){
            if(map.contains(n)){
                return false;                
            }
            int sum = 0;
            int temp = n;
            while(temp > 0){
                int digit = temp % 10;
                sum += digit*digit;
                temp /= 10;
            }
            map.add(n);           
            n = sum;
        }
        return true;
    }
}