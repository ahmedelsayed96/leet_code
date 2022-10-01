class Solution {
    Map<String,Integer> map = new HashMap<String,Integer>();
    public int numDecodings(String s) {
        if(s.isEmpty()) return 1;
        if(s.charAt(0)=='0') return 0;
        if(s.length()==1)  return 1;
        if(map.containsKey(s)) return map.get(s);
        int res1 =numDecodings(s.substring(1));
        int res2 = 0;
        String twodigits = s.substring(0,2);
        
        if(Integer.parseInt(twodigits)<=26){
           res2= numDecodings(s.substring(2));
        }
        map.put(s,res1+res2);
        return res1+res2;
    }
   
}
// 