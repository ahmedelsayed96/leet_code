class Solution {
    public int majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        int n =nums.length;
        int prevNum=nums[0] ;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==prevNum){
                count++;
                if(count>(n/2)) return prevNum;
            }else {
                prevNum=nums[i];
                count=1;
            }
        }
        return prevNum;
        
    }
}