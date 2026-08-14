class Solution {
    public String intToRoman(int num) {
        int[] values={
            1000,900,500,400,100,90,50,40,10,9,5,4,1
        };
        String[] symb={
            "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"
        };
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<13; i++){
            if(num==0) break;
            int times = num/values[i];
            while(times > 0){
                ans.append(symb[i]);
                times--;
            }
            num = num % values[i];
        }
        return ans.toString();
    }
}