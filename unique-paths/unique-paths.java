class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1||n==1) return 1;
        int[] rows =new int[m];
        
        for(int j=n-2;j>=0;j--){
            for(int i=m-2;i>=0;i--){

                int add=rows[i+1];
                if(add==0){
                    add=1;
                }
                int old=rows[i];
                if(old==0){
                    old=1;
                }
               rows[i]=old+add;


            }    
        }
        return rows[0];
    }
}