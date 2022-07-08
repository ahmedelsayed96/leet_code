class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i =0;i<n;i++){
            if(matrix[0][i]>target)
                return false;
        
            for(int j =0;j<m;j++){
                if(matrix[j][i]==target) return true;
                if(matrix[j][i]>target) break;
            }
        }
        return false;
    }
    
}