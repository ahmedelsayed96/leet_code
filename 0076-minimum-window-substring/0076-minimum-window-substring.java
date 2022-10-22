class Solution {
    public String minWindow(String s, String t) {
        int total =0; 
        int m =s.length();
        if(m<t.length()) return "";
        Map<Character,Integer> targetmap = new HashMap<Character,Integer>();
        Map<Character,Integer> currentMap = new  HashMap<Character,Integer>();
        
        for(char ch : t.toCharArray()){
            targetmap.put(ch,targetmap.getOrDefault(ch,0)+1);
            total++;
        }
        int slow =0;
        int fast =-1;
        String minSubString="";
        int currentTotal =0 ; 
        
        int length=Integer.MAX_VALUE;
        while(fast<m){
            if(currentTotal==total){
                char ch =s.charAt(slow);
                slow++;
                if(currentMap.containsKey(ch)){
                    currentMap.put(ch,currentMap.get(ch)-1);
                    if(currentMap.get(ch)<targetmap.get(ch)) currentTotal--;
                }
                
            }else {
               fast++;
                if(fast==m) break;
                char ch =s.charAt(fast);
                if(targetmap.containsKey(ch)){
                    currentMap.put(ch,currentMap.getOrDefault(ch,0)+1);
                    if(currentMap.get(ch)<=targetmap.get(ch)) currentTotal++;
                }
            }

            if(currentTotal==total){
                String subString =s.substring(slow,fast+1);
                if(subString.length()<length){
                    length =subString.length();
                    minSubString =subString;
                }
            }
        }
        return minSubString;
    }
}

// 