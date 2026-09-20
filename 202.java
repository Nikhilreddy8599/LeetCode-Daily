class Solution {
    public int sq(int num){
        int res=0;
        while(num>0){
            int rem=num%10;
            res=res+rem*rem;
            num=num/10;
        }
        return res;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> seen =new HashSet<>();
        while(n!=1 &&!seen.contains(n)){
            seen.add(n);
            n=sq(n);
        }
        return n==1;
    }
}