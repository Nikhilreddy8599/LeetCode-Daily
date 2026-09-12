class Solution {
    public boolean isPalindrome(String s) {
        String str2=s.toLowerCase();
        StringBuilder str=new StringBuilder();
        if(s.equals(" "))return true;
        for(int i=0;i<str2.length();i++){
            if((str2.charAt(i)>='a'&&str2.charAt(i)<='z')||(str2.charAt(i)<='9'&&str2.charAt(i)>='0')){
                str.append(str2.charAt(i));
            }
        }
        
        return str.toString().equals(str.reverse().toString());
    }
}