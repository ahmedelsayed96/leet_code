class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        int m = matrix.length;
        int n =matrix[0].length;
        int nPl=0;
        int mPl=0;
        
        while(m>mPl ||n>nPl){
        
            for(int i=nPl; i< n ;i++){
                list.add(matrix[mPl][i]);
                
            }
            if(m-mPl==1) break;
            mPl++;
            for(int i =mPl;i<m ;i++){
                list.add(matrix[i][n-1]);
            }
            if(n-nPl==1)break;
            n--;
            for(int i = n-1 ; i>=nPl;i--){
                list.add(matrix[m-1][i]);
            }
            if(m-mPl==1)break;
            m--;
            for(int i = m-1 ; i>=mPl;i--){
                list.add(matrix[i][nPl]);
            }
            if(n-nPl==1)break;
            nPl++;
            
            
        }
        
        return list;
        
    }
}