class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int i=0,j=n,x=0;

        // i=nums[0];
        // j=nums[n];
        
        while(i<n){
            arr[x]=nums[i];
            x=x+1;
            arr[x]=nums[j];
            i=i+1;
            j=j+1;
            x=x+1;


        }
        
        // for(int i=0,int j=n;i<n,j<2*n;i++,j++){
        //     arr[x]=nums[i];
        //     x=x+1;
        //     arr[x]=nums[j];
        //     x=x+1;
        // }
        return arr;

    }
}