class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                al.add(nums[i]);
            }
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }

        }
        return al;
    
    
    }
}