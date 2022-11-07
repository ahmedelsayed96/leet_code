class Solution {
    public int maximum69Number (int num) {
        
        int remain = num ;
        int count = 0;
        int lastCount =0;
        while(remain !=0){
            int com = remain/10;
            int current = remain- (com*10);
            remain =com;
            
           if(count==0) count =1;
            else count*=10;
            if(current ==6) lastCount =count ; 
        }
        return num +(lastCount*3);
    }
}