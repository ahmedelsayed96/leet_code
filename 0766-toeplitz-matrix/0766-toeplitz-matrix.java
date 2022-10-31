class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
    
        int m= matrix.length;
        int n = matrix[0].length;
        for(int i =0;i<n-1;i++){
            int row=i+1;
            int col =1;

            int num =matrix[0][i];
            while(col<m &&row<n){
                if(num!=matrix[col][row]) return false;
                row++;
                col++;
            }
        }
        
        for(int i =1;i<m-1;i++){
            int col=i+1;
            int row =1;
            int num =matrix[i][0];
            while(col<m&&row<n){
                if(num!=matrix[col][row]) return false;
                row++;
                col++;
            }
        }        
        
        return true; 
    }
}
//[[36,59,71,15,26,82,87],[56,36,59,71,15,26,82],[15,0,36,59,71,15,26]]