class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int num:nums){
            if(num==0) count0++;
            else if(num==1) count1++;
            else if(num==2)count2++;
        }
        int pointer =0;
       for(int i=pointer;i<nums.length;i++){
          if(nums[i]==0){
              if(pointer!=i){
                nums[i]=nums[pointer];
                nums[pointer]=0;
              }
             
              pointer++;
              if(pointer==count0) break;
          }
       }

       for(int i=pointer;i<nums.length;i++){
          if(nums[i]==1){
              if(pointer!=i){
                nums[i]=nums[pointer];
                nums[pointer]=1;
              }
             
              pointer++;
              if(pointer==count1+count0) break;
          }
       }
        System.out.println("pointer:"+pointer);
       for(int i=pointer;i<nums.length;i++){
          if(nums[i]==2){
              if(pointer!=i){
                nums[i]=nums[pointer];
                nums[pointer]=2;
              }
             
              pointer++;
              if(pointer==count2+count1+count0) break;
          }
       }
    }
}