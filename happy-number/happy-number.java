class Solution {
    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
        int res =n;
        while(res!=1){
            if(list.contains(res)) return false;
            list.add(res);
        int m =res;
            res =0;
            while(m!=0){
                int temp=m/10;
                
                res+=Math.pow((m-(temp*10)),2);
                m =temp;
            }
            
        }
        return true;
    }
}