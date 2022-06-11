class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list =new ArrayList();
        
       
        for (int i = 0; i < numRows; i++) {
            List<Integer> childList =new ArrayList<Integer>();
            childList.add(1);
            
            for (int j = 1; j < i; j++) {
                List<Integer> prevList = list.get(i - 1);
                childList.add(prevList.get(j) + prevList.get(j - 1));
            }
            if(i>0)
            childList.add(1);
            list.add(childList);
        }
        return list;
    }
    
}