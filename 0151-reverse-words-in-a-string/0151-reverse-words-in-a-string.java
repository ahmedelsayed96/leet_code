class Solution {
    public String reverseWords(String str) {
    String[] strArray = str.split(" "); 
        StringBuilder builder = new StringBuilder();
        for(String string :strArray){
            if(string.isEmpty()) continue;
           if(builder.isEmpty()) {
               builder.append(string);
           }else {
            
               builder.insert(0," ");
               builder.insert(0,string);
            }
        }
    return builder.toString();
    }
}