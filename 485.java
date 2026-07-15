class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int prevcount=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
           count=count+1;
           if(count>prevcount){
            prevcount=count;
           } 
        }
        else{
           count=0;
        }
       }
       return prevcount; 
    }
}