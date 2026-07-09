class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List <Integer> list=new ArrayList();
        int size;
        for(int i=0;i<words.length;i++){
            size=words[i].length();
            loop2:
            for(int j=0;j<size;j++){
                if(x==words[i].charAt(j)){
                    list.add(i);
                    break loop2;
                }
            }
        }
        return list;
    }
}