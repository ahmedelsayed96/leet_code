class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list  = new ArrayList<>();
        Map<String, Integer>  map = new HashMap<>();
        for (String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String text = new String(chars);
            if(map.containsKey(text)){
                int index = map.get(text);
                list.get(index).add(str);
            }else {
                List<String> newList = new ArrayList<>();
                map.put(text,list.size());
                newList.add(str);
                list.add(newList);
                
                
            }
        }
        return list ;
    }
}