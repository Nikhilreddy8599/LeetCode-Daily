class Solution {
    public int longestSubsequence(int[] nums) {
        int res=0;
        int xor=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
            if(xor!=0){
                res=i+1;
            }
        }
        return res;
    }
}