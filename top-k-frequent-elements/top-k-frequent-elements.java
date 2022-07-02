class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int num :nums){
            if(map.containsKey(num)){
                 map.put(num, map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        int max =0;
        for (var entry:map.entrySet())
            max=Math.max(max,entry.getValue());
        
        List<Integer>[] arr = (List<Integer>[]) new List[max+1];
        for (int i=0;i<=max;i++)
            arr[i]=new ArrayList<Integer>();
        
        for (var entry:map.entrySet())
            arr[entry.getValue()].add(entry.getKey());
    
        
        int[] res =new int[k];
        int pointer =0;
        for(int i=max;i>0;i--){
            List<Integer> l =arr[i];
            for(int j =0;j<l.size();j++){
                
                res[pointer]=l.get(j);
                pointer++;
                if(pointer==k) return res ;
            }
        }
         
        
    return res;
    }
    
}