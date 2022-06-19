class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> list =new ArrayList<List<String>>();
        int startfrom =-1;
        for (int i =0 ;i<searchWord.length();i++){
            String prefix = searchWord.substring(0,i+1);
            int max =3;
            List<String> matches =new <String>ArrayList();
            int init=startfrom;
            if(init==-1)init=0;
            for(int j =init;j<products.length;j++){
                if(max==0) break;
                if(products[j].length()<=i) continue;
                String matchPrefix =products[j].substring(0,i+1);
                if( startfrom==-1 && matchPrefix.equals(prefix)) startfrom=j;
                if(matchPrefix.equals(prefix)){
                    matches.add(products[j]);
                    max--;
                }
                
            }
            list.add(matches);
        }
        return list;
    }
}