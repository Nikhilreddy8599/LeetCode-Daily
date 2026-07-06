class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(target==matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}