class Solution {
    public int threeSumClosest(int[] nums, int target) {
           Arrays.sort(nums);
        int n = nums.length;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int left =i+1;
            int right =n-1;
            while(left<right){
                int currentSum =nums[i]+nums[right]+nums[left];
                if(currentSum<target){
                    left++;
                }else {
                    right--;
                }
                if(Math.abs(res-target)>Math.abs(currentSum-target)){
                    res =currentSum;
                }

            }
            
            
        }
        return res;
    }
}