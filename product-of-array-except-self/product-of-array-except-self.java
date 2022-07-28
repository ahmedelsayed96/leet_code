class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multi=1; 
        int[] res =new int [nums.length];
        int zeroCount =0;
        for(int n :nums){
            if(n==0) {
                zeroCount++;
                continue;
            }
            multi *=n;
        }
        if(zeroCount>1) return res ;
        for(int i=0;i<nums.length;i++){
                if(zeroCount==1&& nums[i]!=0)
                    res[i]=0;
                else if(zeroCount==1&& nums[i]==0)
                    res[i]= multi;
                else 
                    res[i]=multi/nums[i];
            
        }
        return res;
    }
}