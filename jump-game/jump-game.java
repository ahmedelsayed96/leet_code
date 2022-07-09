class Solution {
    public boolean canJump(int[] nums) {
        int count=0;
       for(int i =0 ;i<nums.length-1;i++){
           count=Math.max(count,nums[i]);
           
           if(count==0) return false;
           count--;
       }
        return true;
    }
    
   
    
}