class Solution {
    public int titleToNumber(String columnTitle) {

        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int num = columnTitle.length() - 1 - i;
            char ch = columnTitle.charAt(i);
            if(num==0)
                sum += (int) ch - 64;
            else
                sum += ((int) ch - 64) * Math.pow(26,num);
        }
        
        return sum;
    }
}