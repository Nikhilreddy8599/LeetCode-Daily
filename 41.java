class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int num=1;
        for(int i=0;i<=nums.length-1;i++){
            if(!set.contains(num)){
                return num ;
            }
            num++;
        }
        return nums[nums.length-1]+1;
    }
}