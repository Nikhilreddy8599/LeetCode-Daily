class Solution {
    
    public int maxDistance(int[] nums1, int[] nums2) {
        int result=0;
        int i=0;
        int j=0;
        // for(int i=0;i<nums1.length;i++){
        //     for(int j=0;j<nums2.length;j++){
        //         if(i<=j && nums1[i]<=nums2[j])
        //         result=Math.max(result,j-i);
        //     }
        // }
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                result=Math.max(result,j-i);
                j++;
            }
            else{
                i++;
            }
        }
        return result;
    }
    
}