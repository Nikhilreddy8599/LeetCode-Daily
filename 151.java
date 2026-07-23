class Solution {
    public String reverseWords(String s) {
        StringBuilder rev=new StringBuilder(s).reverse();
        int n=rev.length();
        String word="";
        String res=""; 
        for(int j=0;j<n;j++){
            while(j<n && rev.charAt(j)!=' '){
                word=word+rev.charAt(j);
                j++;
            }
            word= new StringBuilder(word).reverse().toString();
            if(word.length()>0){
            res=res+" "+word;
            word="";
            }
        }
        return res.substring(1);
    }
}