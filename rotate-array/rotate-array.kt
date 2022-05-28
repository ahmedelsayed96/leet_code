class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        var newK=k;
        if(newK<=0 || newK==nums.size||  nums.size==1) return;
        if(newK>nums.size) newK=newK%nums.size;
        reverseArray(nums,0,nums.size-1);
        reverseArray(nums,0,newK-1);
        reverseArray(nums,newK,nums.size-1);


        
    }
    
    fun reverseArray(nums :IntArray, from :Int ,to :Int){
        var l =to;
        var r= from ;
        while (true){
            val temp = nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l--;
            r++;
            if(r==l||r>l) break;
        }
    }
}