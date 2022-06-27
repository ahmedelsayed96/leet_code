class Solution {
    int[] nums ;
    List<List<Integer>> list =new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length==0) return list;
        this.nums=nums;
        permuteList(0,new ArrayList<Integer>());
        return list;
    }
    public void permuteList(int i ,List<Integer> intList){
        if(intList.size()==nums.length){
           
            list.add(intList);
            return ;
        }
        
        for(int j =0 ;j<nums.length;j++){
           
            
            
            if(!intList.contains(nums[j])){
                List<Integer> newList =new ArrayList();
                newList.addAll(intList);
                newList.add(nums[j]);
                permuteList(i+1, newList);
            }
                
        }
        
    }
}