class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var map =mutableMapOf<Int,Int>();
        for (i in nums){
            if(map.containsKey(i)) return true;
            map[i]=1;
        }
        return false;
    }
}