
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int lengthOfLongestSubstring(String string) {
        
        int totalCount =0 ;
        Queue<Character> queue =  new LinkedList<Character>();
        int currentCount =0;
        for(int i=0;i<string.length();i++){
          char selectedChar =string.charAt(i);

            if(queue.contains(selectedChar)){
               if(currentCount>totalCount){
                   totalCount=currentCount;
               }
                while(queue.size()!=0){
                    char removedChar =queue.remove();

                    if(removedChar == selectedChar){
                        break;
                    }else {
                      currentCount -- ;
 
                    }
                }
                queue.add(selectedChar);

            }else {
                queue.add(selectedChar);
                currentCount++;
            }
        }
        if(currentCount>totalCount){
            totalCount=currentCount;
        }
        
        return totalCount;
    }
}