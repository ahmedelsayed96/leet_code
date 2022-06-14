class Solution {
    public String longestPalindrome(String string) {
        int res=0; 
        int currentRes =0; 
        String resString ="";
        
        int n =string.length();
        
        for ( int i=0 ;i<n;i++){
            
            
            //odd Case 
            int l = i;
            int  r =i;
            while(r< n && l>=0 && string.charAt(l)==string.charAt(r)){
                if((r-l+1) > res){
                    res = r-l +1;
                     resString = string.substring( l,r+1);  
                }
                l--;
                r++;
                
            }
            l = i;
            r = i+1;
                while(r< n && l>=0 && string.charAt(l)==string.charAt(r)){
                if((r-l+1) >res){
                    res = r-l +1;
                     resString = string.substring(l,r+1);  
                }
                l--;
                r++;
                
            }
        }
        return resString;
        
    }
}

//  aba
////012
