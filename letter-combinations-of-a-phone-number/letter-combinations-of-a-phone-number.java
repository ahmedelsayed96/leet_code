class Solution {
    Map<Character,String> map = new  HashMap<Character,String>();
    List<String> list =new ArrayList<String>();
    String digits ;
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return list ;
        this.digits =digits;
        init();
        letterCombination(0,"");
        return list;
        
    }
    
    public void letterCombination(int i,String s){

        if(s.length()==digits.length()) {
            list.add(s);   
            return ;
        }
        for(int j=0; j<map.get(digits.charAt(i)).length();j++){
            String string =s+map.get(digits.charAt(i)).charAt(j);
            letterCombination(i+1,string);
        }
    }
    public void init(){
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

    }
}