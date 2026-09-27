class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int ind='z'-c+1;
            res=res+(ind*(i+1));
        }
        return res;
    }
}