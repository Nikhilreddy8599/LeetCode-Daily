class Solution {
    private int product(int n){
        int prod=1;        
        while(n>0){
            prod=prod*(n%10);
            n/=10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        // if(product(n)==0){
        //     return n;
        // }
        while(product(n)%t!=0){
            n++;
        }
        return n;

    }
}