class Solution {
    String[] chars;
    int[] values;
    public String intToRoman(int num) {
        chars=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        values=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        StringBuilder  builder = new StringBuilder();
        while(num>0){
            int remain =0;
            int count =1;
            while(remain==0){

                int  newNum = num/10;
                int complete = newNum*10;
                 remain =num-complete;
                if(remain==0) {
                    count*=10;
                    num/=10;
                }else{
                    num*=count;
                    num -=remain*count;

                }
            }
            
            remain *=count;
            builder.insert(0,mapRemain(remain));

        }
       return builder.toString(); 
    }
    
    public String mapRemain(int num){
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