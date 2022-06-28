class Solution {
    int[] nums ;
    List<List<Integer>> list =new ArrayList<List<Integer>>();
    
    public List<List<Integer>> subsets(int[] nums) {
        this.nums=nums;
        List<Integer> newList=new ArrayList<Integer>();
        addOrNot(0,newList);
        return list ;
    }
     public void addOrNot(int i,List<Integer> newList){
         if(i==nums.length){
             list.add(newList);
             return ;
         }
         addOrNot(i+1,new ArrayList<Integer>(newList));
         newList.add(nums[i]);
         addOrNot(i+1,new ArrayList<Integer>(newList));
         
     }
}