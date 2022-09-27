class Solution {
    public String pushDominoes(String dominoes) {
        StringBuilder stringBuilder = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();
        stringBuilder.append(dominoes);
        for (int i =0 ;i <dominoes.length();i++){
            char ch = dominoes.charAt(i);
            if((ch=='L'&& i !=0)||(ch=='R'&& i!=dominoes.length()-1)){
                queue.add(i);

            }
        }
        
        while(!queue.isEmpty()){
            int index = queue.poll();
            char ch =stringBuilder.charAt(index);

            if(ch=='L'){
                char leftChar = stringBuilder.charAt(index-1);
                if(leftChar=='.'){
                    stringBuilder.setCharAt(index-1,'L');
                    if(index-1!=0) queue.add(index-1);
                }
                    
            }else if(ch=='R'){
                char rightChar = stringBuilder.charAt(index+1);
                if(rightChar =='.'){
                    if(index+1==dominoes.length()-1){
                        stringBuilder.setCharAt(index+1,'R');
                    }else {
                        char nextToRightChar = stringBuilder.charAt(index+2);
                        if(nextToRightChar=='.'||nextToRightChar =='R'){
                            stringBuilder.setCharAt(index+1,'R');
                            queue.add(index+1);
                        }else if(nextToRightChar =='L'){
                            queue.poll();
                        }
                        
                    }
                    
                }
               
                
            }
            
        }
            return stringBuilder.toString();
    }
}