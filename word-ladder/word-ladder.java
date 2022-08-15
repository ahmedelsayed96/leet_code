class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        
        int level = 1;
        Set<String> words = new HashSet<String>();
        
        for(String word:wordList){
            words.add(word);
        }
        words.remove(beginWord);
        while(!q.isEmpty()){
            int sz = q.size();
            for(int k=0;k<sz;k++){
                String curr = q.poll();
                if(curr.equals(endWord)){
                    return level;
                }
                
                for(int i=0;i<curr.length();i++){
                    for(char ch='a';ch<='z';ch++){
                        String str = curr.substring(0,i) + ch + curr.substring(i+1);
                        if(words.remove(str)){
                            q.offer(str);
                        }
                    }
                }
            }
            level++;
        }
        return 0;    
    }
}