class Solution {
    fun singleNumber(nums: IntArray): Int {
        var map = mutableMapOf<Int,Int>();
        for(i in nums){
            if(map[i]!=null){
                map[i]= (map.get(i)?:1)+1;
            }else{
                map[i]=1;
            }
        }
        for (key in map.keys){
            if(map[key]==1)
            return key;
        }
        return 0;
    }
}