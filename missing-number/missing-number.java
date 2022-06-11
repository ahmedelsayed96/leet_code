class Solution {
    public int missingNumber(int[] nums) {
        int max =0;
        int total=0;
        int realTotal=0;
        boolean containsZero =false ;
        for(int n :nums){
            if(n==0)
            containsZero=true;
            max = Math.max(max,n);
            total+=n;
        }
        
        for(int i=0;i<=max;i++){
            realTotal+=i;
        }
        if(!containsZero)return 0;
        if(realTotal-total==0)
            return max+1;
        
        return realTotal-total;
        
    }
}