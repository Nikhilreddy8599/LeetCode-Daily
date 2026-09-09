class Solution {
    public boolean detectCapitalUse(String word) {
        int val=0;
        int zpos=(word.charAt(0)<='Z'&&word.charAt(0)>='A')?1:0;
        for(int i=1;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch<='Z'&&ch>='A'){
                val=val+1;
            }

        }
        if(val==0&&zpos==0||val==word.length()-1&&zpos==1||zpos==1&&val==0)
        return true;
        return false;
    }
}