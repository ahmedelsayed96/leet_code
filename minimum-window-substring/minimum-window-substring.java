class Solution {
    public String minWindow(String s, String t) {
        if (t.length()>s.length() ) return "";
        if(t.equals(s)) return t;
        Map<Character,Integer> needed =new HashMap<Character,Integer>();
        Map<Character,Integer> have = new HashMap<Character,Integer>();
        int neededValue =0;
        int haveValue =0;
        String ans ="";
        String value ="";
        for(char ch : t.toCharArray()){
            neededValue++;
            needed.put(ch,needed.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(needed.containsKey(ch)){
                int n =needed.get(ch);
                int m =have.getOrDefault(ch,0)+1;
                have.put(ch,m);
                if(m<=n) haveValue++;
                 value+= ch ;
                while(haveValue==neededValue){

                    if(ans.isEmpty() ||ans.length()>value.length())
                        ans =value ;
                    char newCh =value.charAt(0);
                    if (needed.containsKey(newCh)) {
                        have.put(newCh, have.get(newCh) - 1);
                        if (needed.get(newCh) > have.get(newCh))
                            haveValue--;

                    }
                    value=value.substring(1);
                    
                }
                
            }else if(!value.isEmpty() ){
                value+= ch ;
            }
           
        }
        return ans ;
    }
}