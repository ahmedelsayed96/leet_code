class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int slow =nums[0];
        int fast= nums[slow]; 

        while(fast!=slow){ // 3,1  -  4,3  -  4,4
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        
        int newSlow =0;
        while(slow!=newSlow){
            slow = nums[slow];
            newSlow = nums[newSlow];
        }
        return slow;
    }
}