class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];
        int res=0;
        int count=0;
        int pushcount=1;
        
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }

        Arrays.sort(freq);

        for(int i=25;i>=0;i--){
            if(freq[i]==0)break;
            res=res+freq[i]*pushcount;
            count++;
            if(count%8==0){
                pushcount++;
            }
        }

        return res;
    }
}
