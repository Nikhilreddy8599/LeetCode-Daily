class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> missing =new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                for(int k=nums[i]+1;k<nums[i+1];k++){
                missing.add(k);
                }
            }
        }
        return missing;
    }
}