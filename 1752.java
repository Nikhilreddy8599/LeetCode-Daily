class Solution {
    public boolean check(int[] nums) {
        int len=nums.length;
        int deviation=0;
        for(int i=0;i<len;i++){
            if(i<len-1 && nums[i]>nums[i+1]){
                deviation+=1;
            }
            else if(i==len-1 && nums[len-1]>nums[0]){
                deviation+=1;
            }
        }
        if(deviation>=2){
            return false;
        }
        return true;
    }
}