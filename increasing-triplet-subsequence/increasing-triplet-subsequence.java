class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i =nums[0];
        int j =Integer.MAX_VALUE;
        int k =Integer.MAX_VALUE;
        
        for(int index =1;index<nums.length;index++){
            int num =nums[index];
            if(num<=i){
                i=num;
                continue;
            }
            if(num<=j){
                j=num;
                continue;

            }
             if(num<=k){
                return true;
             }
        }
        return false;
    }
}