class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wordBuilder1 = new StringBuilder();
        StringBuilder wordBuilder2 = new StringBuilder();
        
        for(String word :word1 ){
            wordBuilder1.append(word);
        }
        
        for(String word : word2){
            wordBuilder2.append(word);
        }
        
        return wordBuilder2.toString().equals(wordBuilder1.toString());
    }
}