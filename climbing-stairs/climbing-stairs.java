class Solution {
    public int climbStairs(int n) {
       int prev=1;
        int lastPrev=1;
        int res=1;
        for(int i=2;i<n+1;i++){
           res = prev+lastPrev;
            lastPrev=prev;
            prev =res;
        }
        
        return res;
        
    }
}
//n= 1 --> 1 
//n= 2 --> 2
//n=3 --> 3
// n=4 --> 5
// n=5 --> 8
// n=6 --> 13
// n=7 --> 21