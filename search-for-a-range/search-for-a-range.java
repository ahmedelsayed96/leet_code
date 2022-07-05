class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        return searchNum(0,nums.length-1,nums,target);
    }
    public int[] searchNum(int left ,int right,int[] nums ,int target ){
        if(left>right) return new int[] { -1, -1 };
        
        int mid = left + (right-left)/2;
        if(target==nums[mid]){
            return checkMid(mid ,nums,target);
        }
        
        if(nums[mid]>target )
            return searchNum(left, mid-1,nums ,target);
        return searchNum(mid+1, right,nums ,target);

    }
    
    public int[] checkMid(int i,int[] nums ,int target){
        int l=i;
        int r =i ;
        while(nums[l]==target){
            if(l-1>=0 && nums[l-1]==target)
                l--;
            else break;
        }
        while(nums[r]==target){
            if(r+1< nums.length && nums[r+1]==target)
                r++;
            else break;
        }
            
            return new int[]{l,r};
    }
}