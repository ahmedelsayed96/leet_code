class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] founded = new boolean[nums.length+1];
        int total =0;
        int currentTotal=0;
        int duplicatedNum =0  ;
        for(int i=0 ; i<nums.length;i++){
            total+=i+1;
            if(founded[nums[i]]){
                duplicatedNum =nums[i];
            }else {
                founded[nums[i]]=true;
                currentTotal+=nums[i];
            }
        }
        
    return new int[]{duplicatedNum ,total-currentTotal};
    }
}