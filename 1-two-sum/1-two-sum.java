class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        //[2,7,11,15], target = 9
        // On(n2)
        
        for(int i=0 ;i<nums.length;i++){
            //3
            for( int j=i+1;j<nums.length;j++){
                //j =4
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
                
            }
            
            
        }
        
        return new int[]{0,0};
    }
}