class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(n==0) return tasks.length;
        
        // Map<Character,Integer> map = new HashMap<Character,Integer>();
        Map<Character,Integer> count  = new HashMap<Character,Integer>();
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());     
       Queue<int[]> queue = new LinkedList<int[]>();
            
        for(char ch : tasks){
            if(count.containsKey(ch)){
                count.put(ch,count.get(ch)+1);
            }else {
                count.put(ch,1);
            }
        }
        count.forEach((key,value)->{
            heap.add(value);
        });
        int res =0;
        
        while(!heap.isEmpty() || !queue.isEmpty()){
            if(!queue.isEmpty() && queue.peek()[1]<=res){
                heap.add(queue.remove()[0]);
                continue;
            }else if(heap.isEmpty()){
                res++;
                continue;
            }
            res++;
            
            int heapValue = heap.remove();
            if(heapValue>1)
                queue.add(new int[]{heapValue-1,res+n});              
            
        }
        

        
        
        return res ;
        
    }
}