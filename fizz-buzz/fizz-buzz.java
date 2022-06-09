class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list =new ArrayList<String>();
        for(int i=1 ;i<n+1;i++){
            list.add(stringNumber(i));
        }
        
        return list;
    }
    private String stringNumber(int n ){
        if(n%5==0 && n%3==0){
            return "FizzBuzz";
        }else if(n%5==0){
            return "Buzz";
        }else if(n%3==0){
            return "Fizz";
        }else{
            return ""+n;
        }
    }
}