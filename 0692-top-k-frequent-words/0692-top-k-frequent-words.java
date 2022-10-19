class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<NodeItem> queue = new PriorityQueue<NodeItem>(Comparator.reverseOrder());
        
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            NodeItem node = new NodeItem(entry.getKey(),entry.getValue());
            queue.add(node);
        }
        
        List<String> list =new ArrayList<String>();
        for(int i=0;i<k;i++){
            list.add(queue.poll().word);
        }
        
        return list;
    }
    
    
    class NodeItem implements  Comparable<NodeItem>{
        String word;
        int qty; 
        
        NodeItem(String word,int qty){
            this.word=word;
            this.qty=qty;
        }
        
        @Override
        public int compareTo(NodeItem old){
            if(this.qty>old.qty){
                return 1;
            }else if (this.qty<old.qty){
                return -1 ;
            }
            return old.word.compareTo(this.word);

        }
    }
}