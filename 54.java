class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    int n=matrix[0].length;
    int m=matrix.length;
     int left=0;
     int right=n-1;
     int top=0;
     int bottom=m-1;
     List<Integer> list=new ArrayList<>();
     while(left<=right&&top<=bottom){
     for(int i=left;i<=right;i++){
        list.add(matrix[top][i]);
     }
     top++;

    for(int j=top;j<=bottom;j++){
        list.add(matrix[j][right]);
    }
    right--;
    if(top<=bottom){
    for(int k=right;k>=left;k--){
        list.add(matrix[bottom][k]);
    }
    bottom--;
}
    if(left<=right){
    for(int l=bottom;l>=top;l--){
        list.add(matrix[l][left]);
    }
    left++;
    }
    }
    return list;
    }
}