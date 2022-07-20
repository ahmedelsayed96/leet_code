class Solution {
    public int mySqrt(int x) {
        if(x==1 || x ==0) return x;
        int left =1;
        int right = x/2 ;
        int ans =0;
        while(left<=right){
            int mid = left+ (right-left)/2;
            long temp = (long)mid * (long) mid ;
            if(temp ==x ){
                return mid ;
            }else if( temp<x){
                ans =mid ;
                left =mid+1 ;
            }else {
                right =mid -1 ;
            }
        }
        
        return ans; 
        
    }
}