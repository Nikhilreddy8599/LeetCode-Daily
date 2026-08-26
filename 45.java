class Solution {
    public int jump(int[] nums) {
        int left=0;
        int right=0;
        int jumps= 0;
        int farthest;
        if (nums.length == 1) {
            return 0;
        }

        while (right < nums.length-1) {
            farthest=0;
            for(int i=left;i<=right;i++){
                farthest=Math.max(nums[i]+i, farthest);
            }
            left=right+1;
            right=farthest;
            jumps=jumps+1;
        }
        return jumps;
    }
}
