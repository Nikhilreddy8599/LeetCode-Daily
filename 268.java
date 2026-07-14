class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int total=(n*(n+1))/2;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
        }
        int ret=total-sum;
        return ret;

    }
}