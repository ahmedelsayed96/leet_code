class Solution {
    public boolean isPowerOfFour(int n) {
        
        double s =Math.log10(n);
        double t =Math.log10(4);
        double res1 = s/t;
        int res2 =(int)res1;
        
        
        
        return res1==(double)res2;
    }
}