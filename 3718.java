class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int j=1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(j=1;j<=nums.length;j++){
           
            if(!set.contains(k*j))return k*j; 
        }
        return k*(nums.length+1);
    }
}