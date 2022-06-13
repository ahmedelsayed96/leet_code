class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<List<String>> list = new ArrayList<List<String>>();
        
        for(String s : strs){
            
            char[] strArray =s.toCharArray();
            Arrays.sort(strArray);
            String  sum =new String (strArray);
            
            if(map.containsKey(sum)){
                int index =map.get(sum);
                list.get(index).add(s);
            }else {
                List<String> newList = new ArrayList<String>();
                map.put(sum,list.size());
                newList.add(s);
                list.add(newList);
            }
            
        }
        return list;
    }
}