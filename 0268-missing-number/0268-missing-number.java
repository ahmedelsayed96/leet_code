class Solution {
    public int missingNumber(int[] nums) {
        int totalCount = 0;
        int actualCount=0;
        for(int i=0;i<nums.length;i++){
            totalCount+=i;
            actualCount+=nums[i];
        }
        totalCount+=nums.length;
        
        return totalCount-actualCount;
        
    }
}