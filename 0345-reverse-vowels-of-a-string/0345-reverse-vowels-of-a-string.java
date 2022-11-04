class Solution {
    char[] chars ;
    public String reverseVowels(String s) {
        Queue<Character> queue =  new LinkedList<Character>();
        Stack<Integer> positions = new Stack<Integer>();
        
        chars = new char[]{'a', 'e', 'i', 'o',  'u'};
        
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                queue.add(ch);
                positions.add(i);

            }
        }
        StringBuilder text = new StringBuilder(s);
        
        while(!queue.isEmpty()){
            text.setCharAt(positions.pop(),queue.poll());
            
        }
        return text.toString();
    }
    
    public boolean isVowel(char ch){
        
        for(char vowel :chars){
            if(Character.toLowerCase(ch)==vowel) return true;
        }
        return false;
    }
}