class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
            
        String text = countAndSay(n-1);
        
        
        return say(text);
        
    }
    public String say(String text){
        int count =0;
        String res ="";
        char prev ='.';
        for(char ch :text.toCharArray()){
            
            if(prev!=ch&& prev!='.'){
                res+=count+""+prev ;
                count=0;
             
            }
            prev =ch;
            count++;
            
        }
        res+=count+""+prev ;
        return res;
    }
}