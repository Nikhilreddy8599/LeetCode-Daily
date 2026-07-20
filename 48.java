class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int temp;
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<=n-1;j++){
               temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }
    

        for(int z=0;z<n;z++){
        int left=0;
        int right=n-1;
        while(left<right){
           temp=matrix[z][left];
           matrix[z][left]=matrix[z][right];
           matrix[z][right]=temp;
           left++;
           right--;
        }
        
    }
}
}