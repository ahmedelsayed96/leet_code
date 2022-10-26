class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        int count =0;
        map.put(0,-1);
        for(int i =0 ;i<nums.length;i++){
            count +=nums[i];
            int reminder = count%k;
            if(!map.containsKey(reminder)){
                          map.put(reminder,i);

            }else if((i-map.get(reminder))>1){
                  return true;
            }
        }
        
        return false;
    }
}