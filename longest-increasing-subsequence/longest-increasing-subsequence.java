class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] list =new int[n];
        Arrays.fill(list,1);
        
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j])
                    list[i]=Math.max(list[i],1+list[j]);
            }
        }
        int max =Integer.MIN_VALUE;
        for(int num : list){
            max=Math.max(max,num);
        }
        
        return max ;
        
    }
}