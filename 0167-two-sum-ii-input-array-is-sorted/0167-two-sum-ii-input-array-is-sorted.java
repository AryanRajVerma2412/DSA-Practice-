class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int comp = numbers[i] + numbers[j];
            if(comp == target) return new int[]{i + 1, j + 1};
            if(comp>target){
                j--;
            }else{
                i++;
            }
        }
        return new int[]{};
    }
}