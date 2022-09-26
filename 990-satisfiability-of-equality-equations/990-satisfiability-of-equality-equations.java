class Solution {
    
    
    class UnionFind{
        int[] arr;
        public UnionFind(int k){
            arr= new int[k];
            for(int i=0 ;i<k;i++){
                arr[i]=-1;
            }
        }
        void union(int a ,int b ){
            if(arr[a]==-1) arr[a]=a;
            else a = arr[a];
            
            if(arr[b]==-1 || arr[b]==a) {arr[b]=a;}
            else {
                int parent =arr[b];
                for(int i=0 ;i<arr.length;i++){
                    if(arr[i]!=parent) continue;
                    arr[i] = a;
                }
            }
        }
        
        public int find(int a ){
         return arr[a];
        }
    }
    
    public boolean equationsPossible(String[] equations) {
        UnionFind unionFind =new UnionFind(26);
        for(String string :equations ){
            if(string.contains("!=")) continue;
            int a = string.charAt(0)-'a';
            int b = string.charAt(3)-'a';
            unionFind.union(a,b);
        }
        
        for(String string :equations ){
            if(string.contains("==")) continue;
            int a = string.charAt(0)-'a';
            int b = string.charAt(3)-'a';
            if(a==b )return false;
            if(unionFind.find(a)!=-1 && unionFind.find(b)!=-1  && unionFind.find(a)==unionFind.find(b)){
                return false;
            }
        }
        return true;
    }
}