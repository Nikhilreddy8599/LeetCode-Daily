class Solution {
    public int maxDistance(int[] colors) {
        // int colors[]=new int[n];
        int max=0;
        int n=colors.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n;j++){
                if(colors[i]==colors[j]){
                    continue;
                }
                else{
                    max=Math.max(max,Math.abs(j-i));
                }
            }


        }
        return max;
    }
}