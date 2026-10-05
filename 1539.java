class Solution {
    public int findKthPositive(int[] arr, int k) {
        int nums[]=new int[10000];
        int j=0;
        HashSet<Integer> list=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<10000;i++){
            if(!list.contains(i)){
                nums[j]=i;
                j++;
            }
        }
        return nums[k];
    }
}