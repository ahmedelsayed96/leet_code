class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        
        var  holderIndex=1; 
       for (index in 1 until nums.size){
           val indexBefore =index-1;
          if (nums[index]!=nums[indexBefore]){
               nums[holderIndex]=nums[index]
                            holderIndex++;

           }
           
       }
       return holderIndex;
    }
}