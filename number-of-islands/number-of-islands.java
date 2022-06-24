class Solution {
    public int numIslands(char[][] grid) {
        int m =grid.length;
        int n =grid[0].length;
        int count =0;
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    count++;
                }
            }
        }
        
        return count;
    }
    public void bfs(char[][] grid,int i, int j){
        char ch = grid[i][j];
        if(ch!='1'||ch=='0') return ;
         grid[i][j]='.';
        if(i>0){
            bfs(grid,i-1,j);
        }
        if(i+1!=grid.length){
             bfs(grid,i+1,j);
        }
        if(j>0){
            bfs(grid,i,j-1);
        }
        if(j+1!=grid[0].length){
             bfs(grid,i,j+1);
        }
        
    }
}