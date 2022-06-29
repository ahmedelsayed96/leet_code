class Solution {
    int m;
    int n;
    String word;
    char[][] board;
    public boolean exist(char[][] board, String word) {
        boolean isFound =false;
        this.board=board;
         m =board.length;
         n = board[0].length;
        this.word= word;
        for(int i=0;i<m;i++){
            
            for(int j =0 ;j<n;j++){
                Map<String,Boolean> saved = new HashMap<String,Boolean>();
               isFound = isExist(i,j,0,saved);
                if(isFound) return isFound;
            }
        }
            
        return false;
    }
    
    public boolean isExist(int i, int j ,int index  ,Map<String,Boolean> saved ){
         if(index ==word.length()) return true;
        if(i<0||j<0||m<=i||n<=j|| saved.containsKey(i+""+j)|| board[i][j]!=word.charAt(index))return false;
       
        saved.put(i+""+j,true);
        index++;
        boolean exist  = isExist(i+1,j,index,saved)||isExist(i-1,j,index,saved) || isExist(i,j+1,index,saved) || isExist(i,j-1,index,saved);
        if(!exist){
            saved.remove(i+""+j);
        }
            
            
            return exist;
    }
}