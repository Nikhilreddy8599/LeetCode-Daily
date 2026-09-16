class Solution {
    public int totalNumbers(int[] digits) {
        int freq[]=new int[10];
        int count=0;
        for(int digit:digits){
            freq[digit]++;
        }
        for(int j=100;j<999;j++){
            if(j%2!=0){
              continue;  
            }

            int i=j;
            int a=i%10;
            i=i/10;
            int b=i%10;
            i=i/10;
            int c=i%10;
            i=i/10;
            int evenum[]=new int[10];
            evenum[a]++;
            evenum[b]++;
            evenum[c]++;
            boolean possible=true;
            for(int k=0;k<=9;k++){
                if(evenum[k]>freq[k]){
                    possible =false;
                }

            }
            if(possible){
                count++;
            }
        }
        return count;
    }
}