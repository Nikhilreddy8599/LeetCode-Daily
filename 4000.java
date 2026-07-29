class Solution {
    public int largestInteger(int n, int s) {
        int sum=0;
        if(s>9*n){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(s>=9){
                sum=sum*10+9;
                s=s-9;
            }
            else{
                sum=sum*10+s;
                s=0;
            }
        }
        return sum;
    }
}