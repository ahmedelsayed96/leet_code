class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String res =  countAndSay(n-1);
        
        return count(res);
        
    }
    public String count(String s ){
        StringBuilder builder = new StringBuilder();
        char preChar =  s.charAt(0);
        int count=0;
        for(char ch : s.toCharArray()){
            
            if(ch==preChar){
                count++;
                continue;
            }
            builder.append(count);
            builder.append(preChar);
            count=1;
            preChar=ch;
        }
          builder.append(count);
        builder.append(preChar);
        return builder.toString();
        
    }
}