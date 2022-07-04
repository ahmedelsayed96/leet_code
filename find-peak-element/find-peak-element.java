class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        
        for(int i =0;i<nums.length;i++){
            
            int prev ;
            int next ;
            if(i-1<0){
                prev =Integer.MIN_VALUE;
            }else {
                prev =nums[i-1];
            }

            if(i+1>=nums.length){
                next =Integer.MIN_VALUE;
                
            }else {
                next =nums[i+1];
            }
            if(nums[i]>prev &&nums[i]>next) return i;
        }
        return -1;
        
    }
}