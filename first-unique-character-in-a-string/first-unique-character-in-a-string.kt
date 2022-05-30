class Solution {
    fun firstUniqChar(s: String): Int {
        var map:HashMap<Char,Int> = HashMap<Char,Int>();
        var result =-1;
        for (i in s.indices){
            if(map[s[i]]!=null){
                map[s[i]]=map[s[i]]!!+1;
            }else {
                 map[s[i]]=1;
            }
        }

        for(i in s.indices){
            if(map[s[i]]==1){
                return i ;
            }
        }
        
        return  result;
    }
}