class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> map = new HashMap<>();
        int total = 0;
        int  odd =0;
        for(String word : words){ 
            if(word.charAt(0)==word.charAt(1)){
                odd+=2;
            }
            if(map.containsKey(word)){
                total+=4;
                if(word.charAt(0)==word.charAt(1)){
                    odd-=4;
                }
                if(map.get(word)==1){
                    map.remove(word);
                }else{
                    map.put(word, map.get(word)-1);
                }
            }else {
                String reverse = new StringBuilder(word).reverse().toString();
                map.put(reverse,map.getOrDefault(reverse,0)+1);
                
            }
            
        }
        return total +Math.min(odd,2);
    }
    
    
}


//["qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"]
//["qo","  ","  ","qf","","ff","qq","qf","of","of","oo","","  ","  ","qf","of"]