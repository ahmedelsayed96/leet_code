class Solution {
    public int search(int[] nums, int target) {
        int first =nums[0];
        if(first==target) return 0;
        int l=0;
        int r=nums.length-1;
        
        while(l<=r){
            int mid= l+(r-l)/2;
            if(nums[mid]==target) return mid;
            System.out.println(nums[mid]);
            if((nums[mid]>target&& target>first)|| 
               (nums[mid]<target &&target>first && nums[mid]<first)||(target<nums[mid]&&target<first)&&nums[mid]<first){
                r=mid-1;
                if(r>0 && nums[r]==target) return r ;
            }
             else{
                 l =mid+1;
                if(l<nums.length && nums[l]==target) return l ;
             }
            
        }
       
        
        return -1 ;
    }
}