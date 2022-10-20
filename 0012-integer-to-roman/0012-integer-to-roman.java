class Solution {
    String[] chars;
    int[] values;
    public String intToRoman(int num) {
        chars=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        values=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        StringBuilder builder = new StringBuilder();
        
        for(int i=0;i<values.length;i++){
            int value =values[i];
            while(value<=num){
                num-=value;
                builder.append(chars[i]);
            }
        }
       return builder.toString();
    }
    

}