class Solution {
    public String makeGood(String s) {
        char[] chars = s.toCharArray();

        StringBuilder builder = new StringBuilder();
        boolean isChanged=false;
        for(int i=0;i<chars.length;i++){
            if(i ==chars.length-1){
                builder.append(chars[i]);
                continue;
            }
            
        if(Character.toLowerCase(chars[i])==Character.toLowerCase(chars[i+1]) && chars[i]!=chars[i+1]){
             isChanged=true;
            i++;
        }else {
            builder.append(chars[i]);
           
        }
        }
        if(isChanged) return makeGood(builder.toString());
        return s;
    }
}