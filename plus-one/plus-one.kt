class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var up =1;
        var res =digits;
        for (i in res.size-1 downTo 0){
           up = res[i]+up
            if(up  <10){
                res[i]=up;
                up =0;
                break;
            }else {
                res[i]=up-10;
                up=1;
            }
        }
        if(up==1){
        var newArr = IntArray(res.size+1);
            newArr[0]=1;
           
            res =newArr;
        }
        
        return res;
        
    }
}