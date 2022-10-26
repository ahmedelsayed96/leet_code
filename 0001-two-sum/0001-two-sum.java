class Solution {
    public int[] twoSum(int[] nums, int target) {
       // map   (7 ,0)  ,(-2 ,1) , (-6 ,2)
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i<nums.length;i++){
            int num1 = nums[i] ; 
            
            if(map.containsKey(num1)){
                return new int[] {map.get(num1), i};
            }
            
            map.put(target-num1,i);
        }
        
    
        return null;
       
    }
}