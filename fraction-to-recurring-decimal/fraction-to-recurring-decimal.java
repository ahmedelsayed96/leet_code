class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(denominator==0) return "0";
        StringBuilder sb = new StringBuilder();
        if((numerator<0&&denominator>0)||(numerator>0&&denominator<0)){
            sb.append("-");
        }
        long divided = Math.abs((long)numerator);
        long dividor = Math.abs((long) denominator);
        long reminder = divided % dividor;
        sb.append(divided / dividor);
        if(reminder==0)
           return  sb.toString();
        sb.append(".");
        Map<Long,Integer> map = new HashMap<Long,Integer>();
        while(reminder !=0){
            if(map.containsKey(reminder)){
                sb.insert(map.get(reminder),"(");
                sb.append(")");
                break;
            }
            map.put(reminder,sb.length());
            reminder*=10;
            sb.append(reminder/dividor);
            reminder%=dividor;
            
        }
        
        return sb.toString();
    }
}