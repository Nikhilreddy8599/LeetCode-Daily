class Solution {
    int rev(int n){
        int sum=0;
        while(n!=0){
        int rem=n%10;
        sum=sum*10+rem;
        n/=10;
        }
        return sum;
    }
    public int mirrorDistance(int n) {
        int result=rev(n);
        int send=n-result;
        if(send<0){
            return -(send);
        }
        else{
            return send;
        }
    }
}