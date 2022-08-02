class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<Integer>();
        
        for(int num : nums){
           map.add(num);
        }
        int longest =0;
        for(int num :nums){
            if(!map.contains(num-1)){
                int sup =1;
                int numAdd=num+1;
                while(map.contains(numAdd)){
                    sup++;
                    numAdd++;
                }
                longest=Math.max(longest,sup);
            }
        }
        return longest ;
    }
}