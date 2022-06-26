class Solution {
    List<String> list = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        if(n==0) return list ;
       generateParenthesisOnList(0,n,0,"");
        
        return list ;
        
    }
    public void generateParenthesisOnList(int i,int n,int in,String text){
        if(i==n&& in==0){
            list.add(text);
            return ;
        }
        if(i<n){
             
            generateParenthesisOnList(i+1,n,in+1,text+'(');
           
        }
        if(in>0){
            generateParenthesisOnList(i,n,in-1,text+')');
        }
    }
}