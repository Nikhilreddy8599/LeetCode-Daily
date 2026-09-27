class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        int count=0;
        int max=0;
        int left=0;
        for(int n=0;n<(s.length());n++){
            while(set.contains(s.charAt(n))){
                set.remove(s.charAt(left));
                left++;
                count--;
            }
            
            set.add(s.charAt(n));
            count=count+1;
            
            max=Math.max(max,count);

        }
        return max;
    }
}
